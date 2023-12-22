package trycatchfinallytest;

import java.util.*;
import java.lang.*;

class Main
{
    public static int test() {
        try {
            System.out.println("test");
            return 1;
        }
        finally {
            System.out.println("fin");
            return 2;
        }
        //return 3;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int i = test();
        System.out.println("test return " + i);
    }
}
