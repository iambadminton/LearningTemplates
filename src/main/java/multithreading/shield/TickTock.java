package multithreading.shield;

public class TickTock {
    String state;
    synchronized void tick(boolean running) {
        if(!running) {
            state = "ticked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        System.out.print("Tick ");
        state = "ticked";
        notify(); // позволить выполняться методу tock()
        try {
            while (!state.equals("tocked")) {
                wait(); // ожидать до завершения выполнения метода tock()
            }
        }
        catch (InterruptedException e){
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean running) {
        if(!running) {
            state = "tocked";
            notify(); // уведомить ожидающие потоки
            return;
        }
        System.out.print("Tock ");
        state = "tocked";
        notify(); // позволить выполняться методу tick()
        try {
            while (!state.equals("ticked")) {
                wait(); // ожидать до завершения выполнения метода tick()
            }
        }
        catch (InterruptedException e){
            System.out.println("Прерывание потока");
        }
    }


}
