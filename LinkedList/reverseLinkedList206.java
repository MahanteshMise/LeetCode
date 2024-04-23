/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 /*RECURSIVE SOLUTION
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode tmp = head, prev = null, front = null;
        if(head == null || head.next == null){
            return head;
        }
        while(!(tmp==null)){
            front = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = front;
        }
        return prev;
    }
}