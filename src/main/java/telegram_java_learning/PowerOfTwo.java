package telegram_java_learning;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/*напишите потокобезопасную реализацию класса с неблокирующим методом BigInteger next(),
который возвращает элементы последовательсности: [1,2,4,8,16....]
 */
public class PowerOfTwo {
    AtomicReference<BigInteger> current = new AtomicReference<BigInteger>(null);

    BigInteger next() {
        BigInteger recent, next;
        do {
            recent = current.get();
            next = (recent == null) ? BigInteger.valueOf(1) : recent.shiftLeft(1);

        } while (!current.compareAndSet(recent, next));
        return next;
    }
}
