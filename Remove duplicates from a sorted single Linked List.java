/********************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node
 * {
 * public:
 * int data;
 * Node next;
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * };
 * 
 ********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node newNode = temp.next;
            while (newNode != null && newNode.data == temp.data) {
                newNode = newNode.next;
            }
            temp.next = newNode;
            // if(newNode!=null)
            // newNode.prev=temp;
            temp = temp.next;
        }
        return head;
    }
}