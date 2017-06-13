package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 13.06.17.
 */
public class CloneClassTest implements Cloneable {
    Float field_a;

    public CloneClassTest(Float field_a) {
        this.field_a = field_a;
    }

    @Override
    public String toString() {
        return "CloneClassTest{" +
                "field_a=" + field_a +
                '}';
    }


    public static void main(String[] args) throws ClassNotFoundException {
        CloneClassTest obj = new CloneClassTest(5.0f);

        System.out.println(obj.toString());
        //System.out.println(obj2.toString());

        //CloneClassTest obj2 = obj.getClass().getClassLoader().loadClass("CloneClassTest").newInstance();
        //CloneClassTest obj2 = (CloneClassTest) obj.getClass().getClassLoader().loadClass("CloneClassTest").newInstance();
        //CloneClassTest obj2 = obj.


    }
}
