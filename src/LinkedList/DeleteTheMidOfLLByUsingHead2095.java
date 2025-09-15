package LinkedList;

public class DeleteTheMidOfLLByUsingHead2095 {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head ;
        ListNode slow = head ;
        if (head.next == null){
            head = null;
            return head;
        }
        while(fast.next.next != null && fast.next.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
