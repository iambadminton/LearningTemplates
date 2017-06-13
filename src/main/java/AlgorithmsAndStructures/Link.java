package AlgorithmsAndStructures;

/**
 * Created by a.shipulin on 20.02.17.
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
    }
    public void displayLink() {
        System.out.println("{" + iData + ", " + dData + "}");
    }
}
