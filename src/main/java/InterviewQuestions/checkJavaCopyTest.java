package InterviewQuestions;

/**
 * Created by a.shipulin on 20.06.18.
 */
public class checkJavaCopyTest {
    public void printValueOfValue( checkJavaCopy obj) {
        System.out.println(obj.s);
    }

    public void changeObj(checkJavaCopy obj) {
//        obj.s = new String("ttt");
        obj = null;
    }

    public static void main(String[] args) {
        checkJavaCopy a = new checkJavaCopy("a");
        checkJavaCopyTest b = new checkJavaCopyTest();
        b.printValueOfValue(a);
        b.changeObj(a);
        b.printValueOfValue(a);

    }
}
