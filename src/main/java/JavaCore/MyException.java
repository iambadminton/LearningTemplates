package JavaCore;

/**
 * Created by a.shipulin on 04.09.18.
 */
public class MyException extends Exception {
    public MyException(Throwable cause) {
        //super(cause);
        initCause(cause);
    }
}
