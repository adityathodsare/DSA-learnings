package LinkedList;

public class OddEvenLinkedList328 {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null){
            return  head;
        }
        ListNode temp = head ;
        ListNode dummy1 = new ListNode();
        ListNode odd = dummy1;
        ListNode dummy2 = new ListNode();
        ListNode even = dummy2;

        while(temp != null){
            if (temp.val %2 == 0){
                even.next = temp;
                temp = temp.next;
                even = even.next;
            }else {
                odd.next = temp;
                temp = temp.next;
                odd = odd.next;
            }
        }

        if (isStartsWithEven(head)){
            even.next = dummy1.next;
            return dummy2.next;
        }else {
            odd.next = dummy2.next;
            return dummy1.next;
        }

    }

    private boolean isStartsWithEven(ListNode head) {
        if (head.val %2 == 0){
            return  true;
        }
        return  false;
    }
}
