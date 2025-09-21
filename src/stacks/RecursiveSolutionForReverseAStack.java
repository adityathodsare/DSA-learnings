package stacks;

import java.util.Stack;

public class RecursiveSolutionForReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st1.add(6);
        System.out.println(st1);
        reverseAStack(st1);
        System.out.println(st1);
    }
    public static void reverseAStack(Stack<Integer> st){
        if (st.size() == 1 ){
            return;
        }
        int top = st.pop();
        reverseAStack(st);
        pushTopAtBottom(top, st);

    }

    private static void pushTopAtBottom(int x,Stack<Integer> st) {
        if (st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushTopAtBottom(x,st);
        st.push(top);


    }
}
