package LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MargeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return  list1;
        }
        if (list1 ==null){
            return  list2;
        }
        if (list2 ==null){
            return  list1;
        }

        ArrayList<Integer> list = new ArrayList<>();

        while(list1 != null){
            list.add(list1.val);
            list1 =list1.next;
        }
        while(list2 != null){
            list.add(list2.val);
            list2 =list2.next;
        }
        Collections.sort(list);
        ListNode ans = new ListNode();
        ListNode tail = ans ;

        for (int val : list ){
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return  ans.next;


    }


    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode counter = dummy;
        while(list1 != null && list2 != null ){
            if (list1.val < list2.val){
                counter.next = list1;
                list1 = list1.next;
            }else{
                counter.next = list2 ;
                list2 = list2.next;
            }
            counter = counter.next;
        }

        if (list1 != null){
            counter.next = list1;
        }else {
            counter.next = list2;
        }
        return  dummy.next;
    }
}

