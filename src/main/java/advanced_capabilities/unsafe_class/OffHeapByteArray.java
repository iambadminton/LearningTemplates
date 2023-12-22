package advanced_capabilities.unsafe_class;


import sun.misc.Unsafe;

import java.lang.reflect.Field;

/*
Пример хранения информации за пределами heap'а
 */
public class OffHeapByteArray {
    private Unsafe unsafe;
    private long size;
    private long address;


    public OffHeapByteArray(long size) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        this.unsafe = unsafe;
        this.size = size;
        assert unsafe != null;
        this.address = unsafe.allocateMemory(size);
    }

    public void put(long i, byte value) {
        unsafe.putByte(address + i, value);
    }

    public byte get(long i) {
        return unsafe.getByte(address + i);
    }

    public long getSize() {
        return size;
    }

    public void freeMemory() {
        unsafe.freeMemory(address);
    }
}
