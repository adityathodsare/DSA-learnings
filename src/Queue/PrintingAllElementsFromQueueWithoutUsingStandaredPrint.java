package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintingAllElementsFromQueueWithoutUsingStandaredPrint {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        Queue<Integer> q2 = new LinkedList<>();
        while(!q.isEmpty()){
            int memory = q.poll();
            System.out.print(memory+" ");
            q2.offer(memory);
        }

    }
}
