package LinkedList;

public class iterativeReversalOfLinkedList206 {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head ;
        }
        ListNode prev = new ListNode();
        ListNode curr = head;
        ListNode Next = curr;

        while(Next != null){
            Next = curr.next;
            curr.next=prev;
            prev= curr;
            curr = Next;
        }
        return  head;
    }
}
