package generics;

public class Display<T> {
    T obj;

    public Display(T obj) {
        this.obj = obj;
    }

    public void show()  {
        System.out.println("obj = " + obj);
    }
}
