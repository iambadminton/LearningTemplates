package RetraTech;

/**
 * Created by a.shipulin on 27.09.17.
 */
public class MyThread extends Thread{
    public static void main(String[] args) {
        /*System.out.println("id=" + Thread.currentThread().getId() + "\nname=" + Thread.currentThread().getName()
        + "\nisAlive=" + Thread.currentThread().isAlive());
        Thread.currentThread().setName("MyMainThread");
        System.out.println("=================");
        System.out.println("id=" + Thread.currentThread().getId() + "\nname=" + Thread.currentThread().getName()
                + "\nisAlive=" + Thread.currentThread().isAlive());*/
        MyThread myThread = new MyThread();
        myThread.start();

    }

    @Override
    public void run() {
        //super.run();
        System.out.println("Мой поток запущен");
    }


}
