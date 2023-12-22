package JavaCore;

import java.util.UUID;

public class UuidTest {
    public static void main(String[] args) {
        String str =  UUID.randomUUID().toString().replace("-","");
        System.out.println(str);

    }
}
