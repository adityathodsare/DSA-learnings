package stacks;

import java.util.Stack;

public class DisplayingElementsOfStackWithoutUsingStandardMethod {
    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();
        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);
        st1.add(5);
        st1.add(6);
        System.out.println(st1);
        displayElementsOfStack(st1);

    }

    public static void displayElementsOfStack(Stack<Integer> st1 ){
        Stack<Integer> st2 = new Stack<>();
        while (!st1.isEmpty()) {
            System.out.println(st1.peek());
            st2.push(st1.pop());
        }

        System.out.println();
        while (!st2.isEmpty()) {
            System.out.println(st2.peek());
            st1.push(st2.pop());
        }
    }
}
