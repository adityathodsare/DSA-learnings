package LinkedList;

public class RemoveNthNodeFromEnd19 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode headR = head;
            int size=0;
            ListNode counter = head;
            while (counter != null){
                size +=1;
                counter = counter.next;
            }
            if (size == 0){
                headR = null;
            }
            if(size -n ==0){
                headR = headR.next;
                return headR;
            }
            ListNode prev = getNodeOfParticularPosition(size-n, head);
            if (prev.next != null){
                prev.next = prev.next.next;
            }else{
                prev.next =null;
            }
            return headR ;
        }
        public ListNode getNodeOfParticularPosition(int index, ListNode head){
            ListNode temp = head;
            for (int i =1; i<index; i++){
                temp = temp.next;
            }
            return  temp;
        }
    }
}
