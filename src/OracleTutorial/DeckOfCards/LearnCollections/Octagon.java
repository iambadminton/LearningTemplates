package OracleTutorial.DeckOfCards.LearnCollections;

/**
 * Created by a.shipulin on 07.06.17.
 * Пример использования метода clone с сайта stackoverflow
 * https://stackoverflow.com/questions/16044887/clone-has-protected-access-made-public-object-clone
 */
public class Octagon {
    private double side;

    public Octagon(double side) {
        this.side = side;
    }
    @Override
    public Octagon clone() throws CloneNotSupportedException {
        //Octagon octClone = (Octagon)((Octagon)super.clone());
        //return (Octagon)super.clone();
        try {
            return (Octagon)super.clone();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
