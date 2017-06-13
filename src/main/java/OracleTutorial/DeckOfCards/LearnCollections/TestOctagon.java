package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 07.06.17.
 */
public class TestOctagon {
    public static void main(String[] args) {
        try {
            Octagon test = new Octagon(5);
            //Octagon copy = (Octagon) test.clone();
            //Octagon copy = (Octagon)((Object)test).clone();
            Octagon copy = test.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
