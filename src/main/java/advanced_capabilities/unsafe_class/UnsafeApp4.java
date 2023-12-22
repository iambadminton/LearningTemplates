package advanced_capabilities.unsafe_class;

public class UnsafeApp4 {
    public static void main(String[] args) throws Exception {
        OffHeapByteArray array = new OffHeapByteArray(Integer.MAX_VALUE);
        array.put(0, (byte) 32);
        array.put(1, (byte) -32);

        array.put(2, (byte) 1);
        array.put(3, (byte) 0);
        for (int i = 0; i < 4 ; i++) {
            System.out.println(array.get(i));
        }
        array.freeMemory();
        System.out.println(array.get(2));
    }
}
