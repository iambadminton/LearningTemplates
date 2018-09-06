package LearnJavaMail;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by a.shipulin on 06.09.18.
 */
public class AddressBookReader {
    String path;
    ArrayList<PersonInfo> list;

    public AddressBookReader(String path) {
        this.path = path;
    }

    public void read() throws IOException, InvalidFormatException {
        String version = checkVersion();
        if (version.equals("OLE2")) {
            readXLS();
        } else if (version.equals("OOXML")) {
            readXLSX();
        } else {
            System.out.println(version);
        }

    }

    public void readXLS() throws IOException {
        ArrayList<PersonInfo> list = new ArrayList<>();
        PersonInfo personInfo;
        InputStream inputStream = new FileInputStream(this.path);
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet = workbook.getSheetAt(0);
        String fio = "";
        String email = "";
        String id = "";
        Iterator<Row> rowIterator = sheet.rowIterator();
        int rows = sheet.getPhysicalNumberOfRows();
        for (int r = 0; r < rows; r++) {
            HSSFRow row = sheet.getRow(r);
            if (row == null) {
                continue;
            }
            for (int c = 0; c < row.getLastCellNum(); c++) {
                HSSFCell cell = row.getCell(c);
                if (cell != null) {
                    cell.setCellType(CellType.STRING);
                    if (c == 0) {
                        fio = (String) cell.getStringCellValue();
                    /*System.out.print(fio + " ");*/
                    }
                    if (c == 1) {
                        email = (String) cell.getStringCellValue();
                    /*System.out.print(email + " ");*/
                    }
                    if (c == 2) {
                        id = (String) cell.getStringCellValue();
                    /*System.out.print(id + " ");*/
                    }
                }

            }
            personInfo = new PersonInfo(fio, email, id);
            list.add(personInfo);
        }
        this.list = list;

    }


    public void readXLSXRows(Iterator<Row> rowIterator) {
        PersonInfo personInfo;
        ArrayList<PersonInfo> list = new ArrayList<>();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            String fio = "";
            String email = "";
            String id = "";
            String cur_value;
            int j = 0;
            while (cellIterator.hasNext()) {
                j++;
                Cell cell = cellIterator.next();
                cell.setCellType(CellType.STRING);
                if (j == 1) {
                    fio = (String) cell.getStringCellValue();
                    /*System.out.print(fio + " ");*/
                }
                if (j == 2) {
                    email = (String) cell.getStringCellValue();
                    /*System.out.print(email + " ");*/
                }
                if (j == 3) {
                    id = (String) cell.getStringCellValue();
                    /*System.out.print(id + " ");*/
                }
            }
            /*System.out.println("");*/
            personInfo = new PersonInfo(fio, email, id);
            list.add(personInfo);

        }
        this.list = list;

    }


    public void readXLSX() throws IOException, InvalidFormatException {
        ArrayList<PersonInfo> list = new ArrayList<>();

        InputStream inputStream = new FileInputStream(this.path);
        Workbook workbook = new XSSFWorkbook(inputStream);
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        /*System.out.println("имеем следующие листы:");
        while(sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }*/

        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.rowIterator();
        readXLSXRows(rowIterator);

    }

    public String checkVersion() throws IOException {
        FileMagic fileMagic = FileMagic.valueOf(new BufferedInputStream(new FileInputStream(this.path)));

        if (fileMagic.equals(FileMagic.OLE2)) {
            //System.out.println("OLE2");
            return "OLE2";
        } else if (fileMagic.equals(FileMagic.OOXML)) {
            /*System.out.println("OOXML");*/
            return "OOXML";
        } else {
            throw new IOException("Адресная книга имеет неподдерживаемый формат");
        }
    }

    public static void main(String[] args) throws InvalidFormatException, IOException {
        //AddressBookReader reader = new AddressBookReader("C:\\Documents and Settings\\a.shipulin\\Рабочий стол\\Сотрудники ЦКБ РАН.xlsx");
        AddressBookReader reader = new AddressBookReader("C:\\Documents and Settings\\a.shipulin\\Рабочий стол\\Тест.xls");
        reader.checkVersion();
        try {
            reader.read();
            if (reader.list == null) {
                System.out.println("========= NULL +++++++++++");
            }
            for (PersonInfo info : reader.list) {
                System.out.println(info.getFIO() + " " + info.getEmail() + " " + info.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
