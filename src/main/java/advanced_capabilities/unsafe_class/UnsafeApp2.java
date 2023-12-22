package advanced_capabilities.unsafe_class;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeApp2 {
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);

        Secret secret = new Secret();
        Field field = secret.getClass().getDeclaredField("SECRET_VALUE");
        unsafe.putInt(secret, unsafe.objectFieldOffset(field), 37837);
        secret.show();
    }
}
