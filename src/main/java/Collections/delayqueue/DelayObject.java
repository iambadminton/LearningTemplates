package Collections.delayqueue;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayObject implements Delayed {
    private String name;
    private long time;

    public DelayObject(String name, long delayTime) {
        this.name = name;
        this.time = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = time - System.currentTimeMillis();

        return 0;
    }

    @Override
    public int compareTo(Delayed o) {

        if (this.time < ((DelayObject) o).time) {
            return -1;
        }
        if (this.time > ((DelayObject) o).time) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "{\n" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
