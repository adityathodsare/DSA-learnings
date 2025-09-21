package stacks;

import java.util.Stack;

public class InsertAtAnyIndexOrBottom {
    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st1.add(6);
        System.out.println(st1);

        insertAtAnyIndexOfStack(st1,1,7);
    }

    // i want to insert at any position
    // 3rd index
    // [1, 2, 3, 4, 5, 6] = size-n
    // [1,2,7,3,4,5,6]

    public  static  void insertAtAnyIndexOfStack( Stack<Integer> st1, int n , int ele){
        Stack<Integer> st2 = new Stack<>();
        int size = st1.size();
        for (int i =0 ; i<= size-n ; i++){
            st2.push(st1.peek());
            st1.pop();
        }
        System.out.println(st1);
        System.out.println(st2);
        st1.push(ele);
        // [1,2,7
        int size2 = st2.size();
        for (int i =1; i<= size2; i++){
            st1.push(st2.pop());
        }
        System.out.println(st1);
    }

}
