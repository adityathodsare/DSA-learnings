package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st1.add(6);
        System.out.println(st1);
//        System.out.println(st1.size());

//        int size = st1.size();
//        Stack<Integer> st2 = new Stack<>();
//        for(int i =1; i<=size ;i++){
//            st2.push(st1.peek());
//            st1.pop();
//        }
//
//        System.out.println(st2);
        copyStackAsItIs(st1);

    }

    public static void copyStackAsItIs(Stack<Integer> st1){
        int size = st1.size();
        ArrayList<Integer> arr  = new ArrayList<>(st1);
//        for (int i =0; i<size; i++){
//            arr.add(st1.peek());
//            st1.pop();
//        }
        System.out.println("arr is : "+ arr);
        Stack<Integer> st2 = new Stack<>();
        for (int i=0; i< size; i++){
            st2.push(arr.get(i));
        }
        System.out.println("copied stack is : "+ st2);

    }
}
