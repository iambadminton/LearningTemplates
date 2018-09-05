package oop;

/**
 * Created by a.shipulin on 21.08.18.
 */
public abstract class A {
    int a;
    int b;

    public abstract int sum();

    public abstract int diff();

    public int powerOf() {
        return (int)Math.pow(this.a, this.b);
    }


}
