package main.java;

import java.util.Stack;

public class ReverseLinkedList {

//    public static void main(String[] args) {
//
//    }


//    iterative O(n)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }

    // recursion O(n)
//    public ListNode reverseListRecursive(ListNode head) {
//       return recursion(null, head);
//    }
//
//    public ListNode recursion(ListNode prev, ListNode curr) {
//        if (curr == null) {
//            return prev;
//        }
//
//        ListNode next = curr.next;
//        curr.next = prev;
//
//        return recursion(curr, next);
//    }

    public class ListNode {
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

    }
}
