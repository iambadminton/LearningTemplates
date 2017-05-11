package AlgorithmsAndStructures;

/**
 * Created by a.shipulin on 20.02.17.
 */
public class LinkList {
    public Link first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);

    }

    public void  insertFirst(int dD, int iD) {
        Link newLink = new Link(dD,iD);
        newLink.next = first;
        first = newLink;
    }

    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;

        }
    }
}
