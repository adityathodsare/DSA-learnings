package LinkedList;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (l1!=null){
            sb1.append(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            sb2.append(l2.val);
            l2=l2.next;
        }
        int a = Integer.valueOf(sb1.reverse().toString());
        int b = Integer.valueOf(sb2.reverse().toString());
        int result = a+b;
        String ans = String.valueOf(result);
        StringBuilder sb3 = new StringBuilder(ans);
        ans = sb3.reverse().toString();
        char[] ch = ans.toCharArray();
        ListNode dummy = new ListNode();
        ListNode ansList = dummy;
        for(int i =0; i< ch.length; i++){
            ansList.next = new ListNode(ch[i]-'0');
            ansList = ansList.next;
        }
        return  dummy.next;

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode ans = l3 ;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if (l1!= null){
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2!= null){
                sum += l2.val;
                l2 = l2.next;
            }
            ans.next = new ListNode(sum%10);
            carry = sum/10;
            ans = ans.next;

        }
        return  l3.next;
    }
}
