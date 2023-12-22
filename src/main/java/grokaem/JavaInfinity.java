package grokaem;

public class JavaInfinity {
    public static void main(String[] args) {
        Double infinity = Double.POSITIVE_INFINITY;
        if(new Double("10") < infinity) {
            System.out.println("меньше");
        }
        else {
            System.out.println("больше");
        }


    }
}
