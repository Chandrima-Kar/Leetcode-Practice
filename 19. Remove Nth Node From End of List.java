/*
 * Given the head of a linked list, remove the nth node from the end of the list
 * and return its head.
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5], n = 2
 * Output: [1,2,3,5]
 * Example 2:
 * 
 * Input: head = [1], n = 1
 * Output: []
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;// if l=7 and n=3 that means 5th node had to be deleted sothis loop will run
                             // till 3rd node
            // fast is at 3rd node slow is at first node
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {// till fast reaches null there are 4 more iterations, in which slow will reach
                                   // 4th node
            slow = slow.next;
            fast = fast.next;
        }
        ListNode delNode = slow.next;
        slow.next = slow.next.next;// will deleted 5th node and reset the links
        delNode = null;
        return head;
    }
}

// https://youtu.be/3kMKYQ2wNIU?si=w5FhZO0AaIJ1Y074
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
https://takeuforward.org/data-structure/remove-n-th-node-from-the-end-of-a-linked-list/