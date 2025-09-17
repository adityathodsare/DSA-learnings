package LinkedList;

public class isLinkedListPalindromeOptimizedFastSlowPtr234 {
    public boolean isPalindrome(ListNode head) {
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
            if (prev.val != head.val){
                return false;
            }else {
                head = head.next;
                prev = prev.next;
            }
        }
        return true;

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
