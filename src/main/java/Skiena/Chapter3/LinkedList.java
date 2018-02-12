package Skiena.Chapter3;

/**
 * Created by a.shipulin on 09.02.18.
 * Задание 3.10-2:
 * Написать программу для зименения направления односвязного списка
 */
public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }


    public void prepend(Node node) {
        node.next = head;
        head = node;
    }

    public void append(Node data) {
        /*data.next = head;*/
        /*head = data;*/
        Node current = head;
        if(head == null) {
            head = data;
            return;
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = data;
    }

    public void printList(final Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.key + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public Node reverseList(Node node) {
        Node nextElem;
        Node reverseNode;
        if(node == null) {
            return null;
        }
        if(node.next == null) {
            return node;
        }
        nextElem = node.next;
        node.next = null;
        reverseNode = reverseList(nextElem);
        nextElem.next = node;
        return reverseNode;

    }

    public static void main(String[] args) {
        final LinkedList linkedList = new LinkedList();
        /*linkedList.prepend(new Node(12));
        linkedList.prepend(new Node(13));
        linkedList.prepend(new Node(14));
        linkedList.prepend(new Node(15));*/
        linkedList.append(new Node(12));
        linkedList.append(new Node(13));
        linkedList.append(new Node(14));
        linkedList.append(new Node(15));
        linkedList.printList(linkedList.head);
        final Node head = linkedList.reverseList(linkedList.head);
        linkedList.printList(head);
    }




}
