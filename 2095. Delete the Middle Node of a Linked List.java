/*
 * You are given the head of a linked list. Delete the middle node, and return
 * the head of the modified linked list.
 * 
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the
 * start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than
 * or equal to x.
 * 
 * For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2,
 * respectively.
 */

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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        fast = fast.next.next;// skipping one step for slow so that we reache the node before middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
    }
}

// link-https://youtu.be/ePpV-_pfOeI?si=LelCkwM9EBo0y3l6
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
