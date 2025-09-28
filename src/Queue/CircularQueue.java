package Queue;

public class CircularQueue {

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.disply();
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.disply();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.disply();
    }
    int[] arr = new int[5];
    int front =-1;
    int rear = -1;
    int size = 0;
    public  void offer(int ele ){
        if (rear== arr.length-1 && front != 0){
            rear =0;
            arr[rear] = ele;;;
            size++;
            return;
        }
        if (front == -1){
            front =0;
            arr[++rear] = ele;
            size ++;
            return;
        }else{
            arr[++rear] = ele;
            size ++;
            return;
        }
    }

    public int poll(){
        if (front == rear){
            int x = arr[front];
            front = rear =-1;
            size --;
            return x;
        }
        if (front == size-1){
            int x = arr[front];
            if (rear<front) {
                front=0;
                size--;
                return x;
            }
        }
        int x = arr[front++];
        size--;
        return x ;
    }

    public int peek(){
        return arr[front];
    }

    public void disply(){
        for (int i : arr){
            System.out.print(i+' ');
        }
        System.out.println();
    }

}
