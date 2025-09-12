package LinkedList;

import java.util.HashSet;
import java.util.Objects;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        Object arr[] = {1,2,3,4};
        for (Object num : arr){
            System.out.println(num);
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null ){
            return  head;
        }
        ListNode node = head ;
        while(head.next != null){
            if (head.next.val == head.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return  node;
    }


}
