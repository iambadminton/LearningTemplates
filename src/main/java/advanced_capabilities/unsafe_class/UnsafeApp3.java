package advanced_capabilities.unsafe_class;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

public class UnsafeApp3 {
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        unsafe.throwException(new IOException(""));
    }
}
