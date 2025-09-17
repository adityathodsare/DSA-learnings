package LinkedList;

public class MaximumTwinSum2130 {
    public int pairSum(ListNode head) {
        int twinSum = Integer.MIN_VALUE;
        ListNode leftMid = getLeftMiddleNode(head);
        ListNode prev = null;
        ListNode after = null;
        ListNode current = leftMid.next;
        while(current != null){
            after = current.next;
            current.next = prev;
            prev = current;
            current = after;
        }

        while(prev != null){
            twinSum = Math.max(twinSum, (head.val + prev.val));
            head = head.next;
            prev = prev.next;
        }
        return twinSum;
    }

    public ListNode getLeftMiddleNode(ListNode head){
        ListNode fast = head ;
        ListNode slow = head ;
        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
}
