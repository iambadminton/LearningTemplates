package leetcode;

public class Solution203 {
    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        head = new ListNode(6, head);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(6, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);
        int val = 6;

        /*ListNode head = new ListNode(7);
        head = new ListNode(7, head);
        head = new ListNode(7, head);
        head = new ListNode(7, head);
        int val = 7;*/


        Solution203 solution = new Solution203();

        System.out.println(solution.removeElements(head, val));
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
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

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode currNode = dummy;
        //currNode = currNode.next;
        while (currNode != null) {
            if (currNode.next != null && currNode.next.val == val) {
               //currNode.next = currNode.next == null ? null : currNode.next.next;
                ListNode tmp = currNode.next;
                while (tmp != null && tmp.val == val) {
                    tmp = tmp.next == null ? null : tmp.next;
                }
                currNode.next = tmp;

            }
            else {
                currNode = currNode.next;
            }
        }


        return dummy.next;

    }
}
