package JavaCore;

public class TryFinallyTest {
    public static void main(String[] args) {
        try{
            System.out.println("внутри блока try");
            System.exit(-1);
        } finally {
            System.out.println("внутри блока finally");
        }

    }
}
