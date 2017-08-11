package JavaTutorial.ExceptionTuturial;

/**
 задание с оф.сайта JavaTutorial: https://docs.oracle.com/javase/tutorial/essential/exceptions/examples/ListOfNumbers.java

 Exercise: Add a readList method to ListOfNumbers.java. This method should read in int values from a file, print each value, and append them to the
 end of the vector. You should catch all appropriate errors. You will also need a text file containing numbers to read in.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }

    public void writeList() {
        PrintWriter out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));

            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }


    public void readList() {
//        try {
//            System.out.println("Читаем файл");
//            PrintStream in = new PrintStream(new FileReader("InFile.txt"));
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//
//        }

    }

}
