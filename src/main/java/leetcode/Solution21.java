package leetcode;

public class Solution21 {
    public static void main(String[] args) {

        ListNode21 node1 = new ListNode21(4);
        node1 = new ListNode21(2, node1);
        node1 = new ListNode21(1, node1);

        ListNode21 node2 = new ListNode21(4);
        node2 = new ListNode21(3, node2);
        node2 = new ListNode21(1, node2);

        Solution21 solution = new Solution21();
        ListNode21 result = solution.mergeTwoLists(node1, node2);

        System.out.println("result = " + result);


    }

    public ListNode21 mergeTwoLists(ListNode21 list1, ListNode21 list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode21 tmp;

        if (list1.val < list2.val) {
            tmp = list1;
            list1 = list1.next;

        } else {
            tmp = list2;
            list2 = list2.next;
        }

        tmp.next = mergeTwoLists(list1, list2);



        return tmp;
    }


}

class ListNode21 {
    int val;
    ListNode21 next;

    ListNode21() {
    }

    ListNode21(int val) {
        this.val = val;
    }

    ListNode21(int val, ListNode21 next) {
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

