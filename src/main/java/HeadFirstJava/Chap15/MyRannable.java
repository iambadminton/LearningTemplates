package HeadFirstJava.Chap15;

/**
 * Created by a.shipulin on 18.12.17.
 */
public class MyRannable implements Runnable {
    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("Вершина стека");
    }

    @Override
    public void run() {
        go();
    }
}
