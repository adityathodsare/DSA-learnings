package LinkedList;

public class IntersectionOfLinkedList160 {
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        while(  headB != null){
            ListNode temp = headA;
            while(temp != null){
                if (temp == headB){
                    return  temp;
                }
                temp = temp.next;
            }
            headB = headB.next;
        }
        headA = null;
        return headA;

        // not good time 567 ms lets reduce this
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        int sizeA = 0;
        int sizeB = 0;

        while(A != null){
            sizeA++;
            A = A.next;
        }
        while(B != null){
            sizeB++;
            B = B.next;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;
        if (sizeA > sizeB){
            while(  headB != null){
                ListNode temp = headA;
                while(temp != null){
                    if (temp == headB){
                        return  temp;
                    }
                    temp = temp.next;
                }
                headB = headB.next;
            }
        }else {
            while(  headA != null){
                ListNode temp = headB;
                while(temp != null){
                    if (temp == headA){
                        return  temp;
                    }
                    temp = temp.next;
                }
                headA = headA.next;
            }
        }
        headA = null;
        return headA;

        // take same as above
    }
}
