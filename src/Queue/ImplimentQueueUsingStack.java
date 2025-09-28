package Queue;

import java.util.Stack;

public class ImplimentQueueUsingStack {


    public ImplimentQueueUsingStack() {

    }

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public void push(int x) {
        st1.push(x);
    }
    public void transferIfNeeded(){
        if (st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }

    }

    public int pop() {
        transferIfNeeded();
        return st2.pop();
    }

    public int peek() {
        transferIfNeeded();
        return st2.peek();
    }

    public boolean empty() {
        if (!st1.isEmpty()|| !st2.isEmpty()){
            return false;
        }
        return true;
    }
}
