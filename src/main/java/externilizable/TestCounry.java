package externilizable;

import java.io.*;

public class TestCounry {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "d:\\222\\Country.txt";
        Country country = new Country();
        country.setCode(374);
        country.setName("Armenia");

        FileOutputStream fOut = new FileOutputStream(fileName);
        ObjectOutputStream oOut = new ObjectOutputStream(fOut);

        country.writeExternal(oOut);

        oOut.flush();
        oOut.close();
        fOut.close();

        FileInputStream fIn = new FileInputStream(fileName);
        ObjectInputStream oIn = new ObjectInputStream(fIn);

        Country country1 = new Country();
        country1.readExternal(oIn);
        oIn.close();
        fIn.close();

        System.out.println(country.getCode() == country1.getCode());
        System.out.println(country.getName().equals(country1.getName()));

    }
}
