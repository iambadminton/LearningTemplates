package AlgorithmsAndStructures;

/**
 * Created by a.shipulin on 20.02.17.
 */
public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertFirst(1, 1);
        theList.insertFirst(3, 2);
        theList.insertFirst(4, 3);
        theList.insertFirst(5, 2);
        theList.insertFirst(6, 1);
        theList.insertFirst(7, 11);

        theList.displayList();

    }
}
