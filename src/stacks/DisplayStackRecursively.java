package stacks;

import java.util.Stack;

public class DisplayStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st1.add(6);
        System.out.println(st1);
        displayStackRec(st1);
    }
    static Stack<Integer> st2 = new Stack<>();
    public static void displayStackRec(Stack<Integer> st1){
        if (st1.isEmpty()){
            return;
        }
        int top = st1.pop();
        displayStackRec(st1);
        System.out.println(top);
        st1.push(top);
    }
}
