package stacks;

import java.util.Stack;

public class MinStackApproach2 {
//    public MinStackApproach2() {
//        // constructor
//    }

    Stack<Long> st = new Stack<>();
    Long min;

    public void push(int val) {
        if (st.isEmpty()) {
            st.push((long) val);
            min = (long) val;
        } else {
            if (val < min) {
                st.push(2L * val - min);
                min = (long) val;
            } else {
                st.push((long) val);
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            return;
        }
        if (st.peek() > min) {
            st.pop();
        } else {
            min = 2L * min - st.peek();
            st.pop();
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        if (st.peek() >= min) {
            return st.peek().intValue();   // ✅ proper cast
        } else {
            return min.intValue();        // ✅ proper cast
        }
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        return min.intValue();            // ✅ proper cast
    }
}
