package leetcode;

public class Solution876 {
    public static void main(String[] args) {

        ListNode876 node;
        node = new ListNode876(6);
        node = new ListNode876(6, node);
        node = new ListNode876(4, node);
        node = new ListNode876(3, node);
        node = new ListNode876(2, node);
        node = new ListNode876(1, node);

        Solution876 solution = new Solution876();
        System.out.println("result = " +  solution.middleNode(node));
    }

    public ListNode876 middleNode(ListNode876 head) {

        ListNode876 next = head.next;
        if(next == null) return head;
        int count = 1;
        while(next != null) {
            count++;
            next = next.next;
        }
        int middle = count/2 + 1;
        int i = 1;
        next = head.next;
        while (true) {
            i++;
            if(i == middle)
                return next;
            next = next.next;
        }

    }
}


class ListNode876 {
    int val;
    ListNode876 next;

    ListNode876() {
    }

    ListNode876(int val) {
        this.val = val;
    }

    ListNode876(int val, ListNode876 next) {
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