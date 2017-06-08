package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 07.06.17.
 * Тест использования метода clone
 */
public class ObjectCloneTest {
    private int i;
    private boolean b;

    public ObjectCloneTest(int i, boolean b) {
        this.i = i;
        this.b = b;
    }

    @Override
    public String toString() {
        return "ObjectCloneTest{" +
                "i=" + i +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            ObjectCloneTest obj = new ObjectCloneTest(1, true);
            ObjectCloneTest obj2 = (ObjectCloneTest) ((Object)obj.clone());
            System.out.println("obj=" + obj);
            System.out.println("obj2=" + obj2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
