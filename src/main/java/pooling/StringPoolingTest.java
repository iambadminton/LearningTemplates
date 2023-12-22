package pooling;

public class StringPoolingTest {
    public static void main(String[] args) {
        String str1 = "just a string";
        String str2 = "just a string";
        String str3 = new String("just a string");

        System.out.println("str1 equals str2:" + (str1 == str2));
        System.out.println("str1 equals str3:" + (str1 == str3));
        System.out.println("str2 equals str3:" + (str2 == str3));
    }
}
