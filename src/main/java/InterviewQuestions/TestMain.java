package InterviewQuestions;

/**
 * Created by a.shipulin on 21.06.18.
 */
public class TestMain {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            new Thread(new TryCatchFinallyTest()).start();
        }
    }
}
