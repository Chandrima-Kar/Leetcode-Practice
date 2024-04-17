/*
 * Given the head of a linked list, rotate the list to the right by k places.
 * Example 1:
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 * 
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        if (k % len == 0)
            return head;
        k = k % len;
        tail.next = head;
        ListNode newLastNode = find(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;
        return head;
    }

    ListNode find(ListNode temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k)
                return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }
}

// https://youtu.be/uT7YI7XbTY8?si=Gf3Kcx8Bctx--DC2
// https://leetcode.com/problems/rotate-list/