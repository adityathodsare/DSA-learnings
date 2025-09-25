package stacks;

import java.util.Stack;

public class MinStack {
    Stack <Integer> main = new Stack<>();
    Stack <Integer> min = new Stack<>();

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        if (main.isEmpty()){
            main.push(val);
            min.push(val);
        }else {
            if (val<min.peek()){
                min.push(val);
                main.push(val);
            }else {
                main.push(val);
                min.push(val);
            }
        }
    }

    public void pop() {
        main.pop();
        min.pop();
    }

    public int top() {
        return  main.peek();
    }

    public int getMin() {
        return  min.peek();
    }
}


