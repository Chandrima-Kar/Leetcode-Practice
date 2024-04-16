/*
 * You're given a positive integer represented in the form of a singly
 * linked-list of digits. The length of the number is 'n'.
 * 
 * 
 * 
 * Add 1 to the number, i.e., increment the given number by one.
 * 
 * 
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the linked list and the least significant digit is at the tail of the linked
 * list.
 * 
 * 
 * 
 * Example:
 * Input: Initial Linked List: 1 -> 5 -> 2
 * 
 * Output: Modified Linked List: 1 -> 5 -> 3
 * 
 * Explanation: Initially the number is 152. After incrementing it by 1, the
 * number becomes 153.
 */

import java.util.*;
import java.io.*;

/*************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node(int data) {
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 *************************************************************/

public class Solution {
    public static Node addOne(Node head) {
        int carry = helper(head);
        if (carry == 1) {
            Node newnode = new Node(1);
            newnode.next = head;
            return newnode;
        }
        return head;
    }

    static int helper(Node temp) {
        if (temp == null)
            return 1;
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if (temp.data < 10)
            return 0;
        temp.data = 0;
        return 1;
    }
}
// https://youtu.be/aXQWhbvT3w0?si=jaXYG7XvQBQKgJYa
// https://www.naukri.com/code360/problems/add-one-to-a-number-represented-as-linked-list_920557?leftPanelTabValue=PROBLEM
