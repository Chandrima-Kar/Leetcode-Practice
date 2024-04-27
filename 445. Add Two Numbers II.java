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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        ListNode ptr1 = reverse(l1);
        ListNode ptr2 = reverse(l2);
        int carry = 0;
        ListNode ans = null;

        while (ptr1 != null || ptr2 != null) {
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int d = sum % 10;
            ListNode n = new ListNode(d);
            if (ans == null) {
                ans = n;
            } else {
                n.next = ans;
                ans = n;
            }

            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;

        }
        if (carry > 0) {
            ListNode n = new ListNode(carry);
            if (ans == null) {
                ans = n;
            } else {
                n.next = ans;
                ans = n;
            }
        }
        return ans;
    }

    ListNode reverse(ListNode head) {
        ListNode temp = head, prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}