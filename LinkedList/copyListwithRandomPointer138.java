class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        //Creating a duplicate node
        Node curr = head;
        while(curr!=null){
            Node originalNext = curr.next;
            Node copyNode = new Node(curr.val);
            copyNode.next = originalNext;
            curr.next = copyNode;
            curr = originalNext;
        }
        // Assigning the random variable links
        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        //Decoupling the double list
        //Decoupling the double list
        curr = head;
        Node copyHead = head.next;
        while(curr != null){
            Node next = curr.next.next;
            Node copy = curr.next;
            curr.next = next;
            if(next != null){
                copy.next = next.next;
            }
            curr = next;
        }
        return copyHead;
    }
}