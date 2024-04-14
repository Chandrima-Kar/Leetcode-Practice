/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null)
            return true;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = reverseList(slow);
        ListNode first = head;
        ListNode second = newHead;
        while (second != null) {
            if (first.val != second.val) {
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;

        }
        reverseList(newHead);
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}

// link-https://leetcode.com/problems/palindrome-linked-list/
// https://youtu.be/lRY_G-u_8jk?si=Ayo0I2yOID8YD1fJ
// https://takeuforward.org/data-structure/check-if-given-linked-list-is-plaindrome/