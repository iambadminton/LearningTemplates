package oop;

/**
 * Created by a.shipulin on 21.08.18.
 */
public abstract class B extends A {
    @Override
    public int powerOf() {
        return (int)Math.pow(this.b, this.a);
    }
}
