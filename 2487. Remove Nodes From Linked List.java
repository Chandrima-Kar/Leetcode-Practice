/*
 * You are given the head of a linked list.
 * 
 * Remove every node which has a node with a greater value anywhere to the right
 * side of it.
 * 
 * Return the head of the modified linked list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [5,2,13,3,8]
 * Output: [13,8]
 * Explanation: The nodes that should be removed are 5, 2 and 3.
 * - Node 13 is to the right of node 5.
 * - Node 13 is to the right of node 2.
 * - Node 8 is to the right of node 3.
 * Example 2:
 * 
 * Input: head = [1,1,1,1]
 * Output: [1,1,1,1]
 * Explanation: Every node has value 1, so no nodes are removed.
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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = reverse(head);
        ListNode curr = temp;
        int maxValue = Integer.MIN_VALUE;
        ListNode prev = null;
        while (curr != null) {
            if (curr.val < maxValue) {
                prev.next = curr.next;
            } else {
                maxValue = curr.val;
                prev = curr;
            }
            curr = curr.next;
        }
        return reverse(temp);

    }

    ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}

/*
 * This approach involves reversing the linked list and while traversing the
 * reversed list, keeping track of the maximum value seen so far. If the current
 * node's value is less than the maximum value, the node is removed; otherwise,
 * the maximum value is updated. Finally, the reversed list is reversed again to
 * get the correct order.
 * 
 * Detailed Steps:
 * Reverse the linked list.
 * Initialize a pointer current to traverse the reversed list and a variable
 * max_value to keep track of the maximum value seen so far (initialized to
 * negative infinity).
 * Traverse the reversed list while keeping track of the previous node prev.
 * For each node, if its value is less than max_value, remove the node by
 * updating the next pointer of the previous node. Otherwise, update max_value.
 * Reverse the modified list again to get the correct order.
 * Finally, return the modified linked list.
 */