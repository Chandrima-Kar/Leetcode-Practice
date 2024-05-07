/*
 * You are given the head of a non-empty linked list representing a non-negative
 * integer without leading zeroes.
 * 
 * Return the head of the linked list after doubling it.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,8,9]
 * Output: [3,7,8]
 * Explanation: The figure above corresponds to the given linked list which
 * represents the number 189. Hence, the returned linked list represents the
 * number 189 * 2 = 378.
 * Example 2:
 * 
 * 
 * Input: head = [9,9,9]
 * Output: [1,9,9,8]
 * Explanation: The figure above corresponds to the given linked list which
 * represents the number 999. Hence, the returned linked list reprersents the
 * number 999 * 2 = 1998.
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
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        int twice_of_val = 0;
        while (curr != null) {
            twice_of_val = curr.val * 2;
            if (twice_of_val < 9) {
                curr.val = twice_of_val;
            } else if (prev != null) {
                curr.val = twice_of_val % 10;
                prev.val = prev.val + 1;
            } else {
                head = new ListNode(1, curr);
                curr.val = twice_of_val % 10;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}

/*
 * Two Pointers:
 * 🧠Intuition:
 * This approach traverses the linked list using two pointers, curr and prev, to
 * keep track of the current and previous nodes, respectively. During traversal,
 * it doubles the value of each node and handles any carry generated. If the
 * doubled value of a node is less than 10, it updates the node's value
 * accordingly. If the doubled value is 10 or greater, it distributes the carry
 * to the previous node's value. If the first node requires a carry, it adds a
 * new node with the carry as its value and links it to the current node.
 * Finally, it returns the head of the modified linked list.
 * 
 * 📚Detailed Approach:
 * Initialize Pointers: Initialize curr to point to the head of the linked list
 * and prev to None.
 * 
 * Traverse the Linked List:
 * 
 * Start traversing the linked list using the curr pointer.
 * While traversing:
 * Calculate the doubled value of the current node's value (twice_of_val).
 * Check if the doubled value is less than 10.
 * If yes, update the current node's value to twice_of_val.
 * If the doubled value is 10 or greater:
 * Check if prev is not None (i.e., the current node is not the first node).
 * If yes:
 * Update the current node's value with the units digit of twice_of_val.
 * Add 1 to the value of the previous node to handle the carry.
 * If prev is None (i.e., the current node is the first node):
 * Create a new node with the carry (1) as its value and link it to the current
 * node.
 * Update the current node's value with the units digit of twice_of_val.
 * Update Pointers:
 * 
 * Update prev to point to the current node (prev = curr).
 * Move curr to the next node (curr = curr.next).
 * Return Modified Linked List: After traversing the entire linked list, return
 * the head of the modified linked list (head).
 */