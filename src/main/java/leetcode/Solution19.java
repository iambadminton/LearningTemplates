package leetcode;

public class Solution19 {
    public static void main(String[] args) {
        ListNode19 node;
//        node = new ListNode(3);
//        node = new ListNode(2, node);
//        node = new ListNode(1, node);

//        node = new ListNode(2);
//        node = new ListNode(1, node);

        node = new ListNode19(6);
        node = new ListNode19(5, node);
        node = new ListNode19(4, node);
        node = new ListNode19(3, node);
        node = new ListNode19(2, node);
        node = new ListNode19(1, node);

        Solution19 solution = new Solution19();
        System.out.println("result = " +
                solution.removeNthFromEnd(node, 2));


    }

    public ListNode19 removeNthFromEnd(ListNode19 head, int n) {
        int i = 0;
        ListNode19 next = new ListNode19(0);
        next.next = head;
        ListNode19 tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            i++;
        }
        int count = i;
        System.out.println(count);


        tmp = next;
        for (int j = 0; j < count -n ; j++) {
            System.out.println("j = " + j);
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;

        System.out.println("next = " + next);
        System.out.println("head = " + head);

        return next.next;


    }


    public ListNode19 removeNthFromEnd2(ListNode19 head, int n) {
        ListNode19 dummy = new ListNode19(0);
        dummy.next = head;
        int length  = 0;
        ListNode19 first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }


}

class ListNode19 {
    int val;
    ListNode19 next;

    ListNode19() {
    }

    ListNode19(int val) {
        this.val = val;
    }

    ListNode19(int val, ListNode19 next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}