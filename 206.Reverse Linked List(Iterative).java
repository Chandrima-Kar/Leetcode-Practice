class Solution {
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

// link-https://leetcode.com/problems/reverse-linked-list/
// https://youtu.be/D2vI2DNJGd8?si=n-gNdxrPGRn_NZqP
// https://takeuforward.org/data-structure/reverse-a-linked-list/