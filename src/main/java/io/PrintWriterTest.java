package io;

import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println(new String("just string"));
    }
}
