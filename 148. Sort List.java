/*
 * Given the head of a linked list, return the list after sorting it in
 * ascending order.
 * 
 * Example 1:
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
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
    public ListNode sortList(ListNode head) {
        ListNode mergedList = mergeSort(head);
        return mergedList;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode fast = head.next;// doing a step ahaed so that we get the first middle node
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;// returning middle node
    }

    public ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (leftHead != null && rightHead != null) {
            if (leftHead.val < rightHead.val) {// checking
                temp.next = leftHead;// and merging the lists
                temp = temp.next;
                leftHead = leftHead.next;
            } else {
                temp.next = rightHead;
                temp = temp.next;
                rightHead = rightHead.next;
            }
            if (leftHead != null)
                temp.next = leftHead;
            else
                temp.next = rightHead;
        }
        return dummyNode.next;// returning the merged list
    }

    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode middle = findMiddle(head);// finding middle of linked list
        ListNode leftHead = head;// head of left part of list
        ListNode rightHead = middle.next;// head of right part of list
        middle.next = null;// the middle.next should be zero so that the lists are separated
        leftHead = mergeSort(leftHead);// to sort the left list
        rightHead = mergeSort(rightHead);// to sort the right list
        return merge(leftHead, rightHead);// to merge both the lists
    }
}
// https://youtu.be/8ocB7a_c-Cc?si=iAiu0hV31IgPlh6y
// https://leetcode.com/problems/sort-list/