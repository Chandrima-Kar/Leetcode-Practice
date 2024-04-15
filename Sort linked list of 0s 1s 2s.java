/*
 * Problem statement
 * Given a linked list of 'N' nodes, where each node has an integer value that
 * can be 0, 1, or 2. You need to sort the linked list in non-decreasing order
 * and the return the head of the sorted list.
 * 
 * 
 * 
 * Example:
 * Given linked list is 1 -> 0 -> 2 -> 1 -> 2.
 * The sorted list for the given linked list will be 0 -> 1 -> 1 -> 2 -> 2.
 */

/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static Node sortList(Node head) {
        // Write your code here
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twohead = new Node(-1);
        Node zero = zeroHead, one = oneHead, two = twohead;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = oneHead.next;
        one.next = twohead.next;
        two.next = null;
        return zeroHead.next;
    }
}

// https://youtu.be/gRII7LhdJWc?si=HA09zSvLsU-PDWxA
// https://www.naukri.com/code360/problems/sort-linked-list-of-0s-1s-2s_1071937?leftPanelTabValue=PROBLEM