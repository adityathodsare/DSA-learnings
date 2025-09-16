package LinkedList;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null){
            head = null;
            return head;
        }
        ListNode fast = head ;
        ListNode slow = head ;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == null){
                head = null;
                return head ;
            }
            if (fast == slow){
                break;
            }
        }
        ListNode temp = head ;
        while(temp != slow){
            if (slow == null){
                head = null;
                return head ;
            }
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }
}
