package Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueue {

    Queue<Integer> q = new LinkedList<>();
    ArrayList<Integer> arr = new ArrayList<>();
    public void push(int x) {
        q.offer(x);
    }
    public void  transferReq(){
        if (arr.isEmpty()){
            while(!q.isEmpty()){
                arr.add(q.poll());
            }
        }
    }

    public int pop() {
        transferReq();
        return arr.remove(arr.size()-1);
    }

    public int top() {
        transferReq();
        return arr.get(arr.size()-1);
    }

    public boolean empty() {
        if (!arr.isEmpty() || !q.isEmpty()){
            return false;
        }
        return true;
    }
}
