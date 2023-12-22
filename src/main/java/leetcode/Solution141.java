package leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution141 {
    public static void main(String[] args) {
        Solution141 solution = new Solution141();

    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode currentNode = head;
        while (currentNode != null) {
            if(set.contains(currentNode)) {
                return true;
            }
            set.add(currentNode);
            currentNode = currentNode.next;

        }
        return false;
    }
}

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          ListNode node = (ListNode) o;
          return val == node.val &&
                  Objects.equals(next, node.next);
      }

      @Override
      public int hashCode() {
          return Objects.hash(val, next);
      }
  }