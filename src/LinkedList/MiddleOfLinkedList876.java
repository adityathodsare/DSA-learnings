package LinkedList;

public class MiddleOfLinkedList876 {
    public ListNode middleNode1(ListNode head) {
        ListNode counter = head;
        int size = 0;
        while(counter != null){
            size +=1;
            counter = counter.next;
        }
        if (iseven(head,size)){
            // two middle ele
            for (int i =1; i<size/2; i++){
                head = head.next;
            }
            return head;

        }else {
            // one middle element
            for (int i =1; i<size/2; i++){
                head = head.next;
            }
            return head;

        }
    }
    public boolean iseven(ListNode head , int size){

        if (size %2 == 0){
            return  true;
        }
        return false;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
}
