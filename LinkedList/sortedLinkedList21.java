import java.util.*;
import java.util.*;

public class MergeSortedLinkedList21 {
    static class ListNode {
        int val;
        ListNode next;

        // Constructor
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeSortedLinkedList21 obj = new MergeSortedLinkedList21();
        ListNode result = obj.mergeTwoLists(list1, list2);

        // Printing the result
        ListNode ptr = result;
        while (ptr != null) {
            System.out.print(ptr.val + " ");
            ptr = ptr.next;
        }
    }
}
