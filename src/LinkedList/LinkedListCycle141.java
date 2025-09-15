package LinkedList;

public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null ){
            return  false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            if (slow == null){
                return  false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast ){
                return  true;
            }
        }
        return  false;
    }
}
