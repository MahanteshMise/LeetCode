public class reorderList143 {
    private ListNode head; // Added head field

    public reorderList143(ListNode head){
        this.head = head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode findMiddle(ListNode tmpHead){
        ListNode slow = tmpHead, fast = tmpHead;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode tmpHead){
        ListNode prev = null;
        ListNode curr = tmpHead;
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    public ListNode reorderList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode middleNode = findMiddle(head);
        ListNode head2 = reverseList(middleNode.next);
        middleNode.next = null;

        ListNode curr = head;
        ListNode dummy = head2;

        while(curr != null && dummy != null){
            ListNode temp = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            curr = temp;
            dummy = temp2;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
//        list1.next.next.next.next = new ListNode(5);

        reorderList143 obj = new reorderList143(list1); // Creating an object of reorderList143

        ListNode tmpHead = obj.reorderList(list1); // Reordering the list

        // Printing the reordered list
        while(tmpHead != null){
            System.out.println(tmpHead.val);
            tmpHead = tmpHead.next;
        }
    }
}
