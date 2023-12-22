package trycatchfinallytest;

public class FinallyExceptionTest {
    public static void main(String[] args) {
        int i = 1;
        int j = 12;
        try {
            System.out.println("i*j= " + i*j);
        }
        catch (Exception e) {
            System.out.println("exception: " + e.toString());
        }
        finally {
            throw new IllegalArgumentException("finally block");
        }
    }
}
