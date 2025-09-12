package LinkedList;

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
        while( list2.next !=null){
            if (list1.next.val > list2.val){
                list1.next = list2;
                continue;
            }else{
                list1 = list1.next;
            }

        }
        return  list1;
    }
}

