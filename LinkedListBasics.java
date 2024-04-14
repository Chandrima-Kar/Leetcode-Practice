import javax.swing.text.AbstractDocument.LeafElement;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class LinkedListBasics {
    private static Node convertArrtoLL(int[] arr)// To convert an array to a linked list
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }

    private static int display(Node head) // to display a linked list
    {
        Node temp = head;
        int c = 0;
        while (temp != null) {

            System.out.print(temp.data + " -> ");
            temp = temp.next;
            c++;
        }
        System.out.print("Null");
        return c;
    }

    public static void main(String args[]) {
        int[] arr = { 15, 5, 6, 7, 8, 10 };
        Node y = new Node(arr[2]);
        System.out.println(y.data);// to print data part of linked list
        System.out.println(y.next);// to print pointer part of linked list

        /*************************************
         * To convert an array to a linked list************************
         */
        Node head = convertArrtoLL(arr);
        System.out.println(head.data);

        // to display a linked list and length of linked list
        int c = display(head);
        System.out.println("\nLength: " + c);
    }
}
