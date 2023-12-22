package sobes;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer  buffer = new StringBuffer("Hello ");
        System.out.println("Buffer contents after creation: " + buffer);
        buffer.append(", Welcome to Java8Example blog");

        System.out.println("Buffer contents after append: " + buffer);
        System.out.println("Buffer Length: " + buffer.length());

        buffer.insert(5, " Saying Hai");
        System.out.println("Buffer contents after insertion: " + buffer);

        buffer.delete(5, 14);
        System.out.println("Buffer contents after deletion: " + buffer);
    }
}
