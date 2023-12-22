package sobes;

public class StringBufferExample2 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("This is a string");
        buffer = buffer.reverse();
        System.out.println(buffer.toString());
    }
}
