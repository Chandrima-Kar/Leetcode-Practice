/*
 * A linked list of length n is given such that each node contains an additional
 * random pointer, which could point to any node in the list, or null.
 * 
 * Construct a deep copy of the list. The deep copy should consist of exactly n
 * brand new nodes, where each new node has its value set to the value of its
 * corresponding original node. Both the next and random pointer of the new
 * nodes should point to new nodes in the copied list such that the pointers in
 * the original list and copied list represent the same list state. None of the
 * pointers in the new list should point to nodes in the original list.
 * 
 * For example, if there are two nodes X and Y in the original list, where
 * X.random --> Y, then for the corresponding two nodes x and y in the copied
 * list, x.random --> y.
 * 
 * Return the head of the copied linked list.
 */

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        while (temp != null) {// creating copy nodes
            Node copyNode = new Node(temp.val);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }
        temp = head;
        while (temp != null) {// attaching random pointers
            if (temp.random != null) {
                temp.next.random = temp.random.next;
            } else
                temp.next.random = null;
            temp = temp.next.next;
        }
        Node dummy = new Node(-1);// separating new linked list form the old one
        Node res = dummy;
        temp = head;
        while (temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
            res = res.next;
            temp = temp.next;
        }
        // res.next=null;
        return dummy.next;
    }
}

// https://youtu.be/q570bKdrnlw?si=Xho0PGF7Sb6weJ98
// https://leetcode.com/problems/copy-list-with-random-pointer/