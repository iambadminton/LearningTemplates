package interviewbit;

import java.util.ArrayList;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

/*class List {
    ListNode firstElement;

    public List(ListNode firstElement) {
        this.firstElement = firstElement;
    }

    public List() {
    }

    void addElement(ListNode node) {
        ListNode currentNode = firstElement;
        while (true) {
            //currentNode = currentNode.nextNode;
            if (currentNode.nextNode == null) {
                currentNode.nextNode = node;
                break;
            } else {
                currentNode = currentNode.nextNode;
            }
        }
    }

    public ListNode getFirstElement() {
        return firstElement;
    }
}
 */

public class Solution2 {
    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list = list.next;
        list.next = new ListNode(3);
        list = list.next;
        list.next = new ListNode(4);
        list = list.next;
        list.next = new ListNode(5);
        list = list.next;
        list.next = new ListNode(6);
        list = list.next;
        list.next = new ListNode(7);
        list = list.next;
        list.next = new ListNode(8);
        list = list.next;


        /*Node node = list.firstElement;
        while (true) {
            System.out.print(node.data + " -> ");
            node = node.nextNode;
            if(node == null ) {
                break;
            }
        }
        */

        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode node = list;
        ListNode newList = null;
        arr.add(node);
        while (true) {

            if (node.next == null) {
                break;
            } else {
                node = node.next;
                arr.add(node);
            }
        }
        /*System.out.println("================");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).val);

        }
        System.out.println("================");
        System.out.println(Math.round(arr.size() / 2));
        if (arr.size() > 0) {
            newList = new ListNode(arr.get(0).val);
            if (arr.size() > 1) new ListNode(arr.get(arr.size() - 1).val);

            for (int i = 1; i < Math.round(arr.size() / 2); i++) {
                newList.next = new ListNode(arr.get(i).val);
                if (i != arr.size() - 1 - i) newList.next = new ListNode(arr.get(arr.size() - 1 - i).val);
            }
        }
        */


        newList = reorderList(list);

        //ListNode element = newList.next;
        while (newList != null) {
            System.out.println(newList.val);
            System.out.print(" -> ");
            newList = newList.next;
        }

    }

    public static ListNode reorderList(ListNode A) {
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode node = A;
        ListNode newList = null;
        arr.add(node);
        while (true) {
            if (node.next == null) {
                break;
            } else {
                node = node.next;
                arr.add(node);
            }
        }
//        System.out.println("================");
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i).val);
//
//        }
//        System.out.println("================");
//        System.out.println(Math.round(arr.size() / 2));
        if (arr.size() > 0) {
            newList = new ListNode(arr.get(0).val);
            if (arr.size() > 1) new ListNode(arr.get(arr.size() - 1).val);

            for (int i = 1; i < Math.round(arr.size() / 2); i++) {
                newList.next = new ListNode(arr.get(i).val);
                if (i != arr.size() - 1 - i) newList.next = new ListNode(arr.get(arr.size() - 1 - i).val);
            }
        }


        return newList;
    }

}
