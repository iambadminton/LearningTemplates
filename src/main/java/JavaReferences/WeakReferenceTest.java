package JavaReferences;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        Object o = new Object();

        WeakReference<Object> ref = new WeakReference<>(o);
        o = null;
        Object ob1 = ref.get();
        System.out.println(ob1);

    }
}
