package generics;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }


    public T readObjectData(Class<T> type) {
        return vals[0];
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }

    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Максимальное значение в массиве inums " + iob.max());
        System.out.println("Минимальное значение в массиве inums " + iob.min());

        System.out.println("Максимальное значение в массиве chs " + cob.max());
        System.out.println("Минимальное значение в массиве chs " + cob.min());

        System.out.println(iob.readObjectData(Integer.class));
    }

}
