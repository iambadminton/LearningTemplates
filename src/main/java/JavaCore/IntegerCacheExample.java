package JavaCore;

public class IntegerCacheExample {
    public static void main(String[] args)
    {
        Integer integer1 = 3;
        Integer integer2 = 3;

        Integer integer3 = 129;
        Integer integer4 = 129;

        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }
}
