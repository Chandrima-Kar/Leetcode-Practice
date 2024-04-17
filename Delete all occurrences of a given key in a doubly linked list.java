/*
 * A doubly-linked list is a data structure that consists of sequentially linked
 * nodes, and the nodes have reference to both the previous and the next nodes
 * in the sequence of nodes.
 * 
 * 
 * 
 * You’re given a doubly-linked list and a key 'k'.
 * 
 * 
 * 
 * Delete all the nodes having data equal to ‘k’.
 * 
 * 
 * 
 * Example:
 * Input: Linked List: 10 <-> 4 <-> 10 <-> 3 <-> 5 <-> 20 <-> 10 and ‘k’ = 10
 * 
 * Output: Modified Linked List: 4 <-> 3 <-> 5 <-> 20
 * 
 * Explanation: All the nodes having ‘data’ = 10 are removed from the linked
 * list.
 */

/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * public Node prev;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * this.prev = null;
 * }
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * this.prev = null;
 * }
 * Node(int data, Node next, Node prev)
 * {
 * this.data = data;
 * this.next = next;
 * this.prev = prev;
 * }
 * }
 * 
 *****************************************************************/

public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        if (head == null)
            return head;
        Node temp = head;
        while (temp != null) {
            if (temp.data == k) {
                Node temp2 = temp;
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                if (temp == head)
                    head = head.next;
                temp = temp.next;
                temp2.prev = null;
                temp2.next = null;
            } else
                temp = temp.next;
        }
        return head;
    }
}
