package LinkedList;

import java.util.ArrayList;
import java.util.Objects;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null){
            return true;
        }
        ListNode temp = head;
        ArrayList<Object> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        if (list.equals(list.reversed())){
            return true;
        }
        return  false;

    }
}
