package Queue;

public class ArrayImplOfQueue {
    public static void main(String[] args) {
        ArrayImplOfQueue q = new ArrayImplOfQueue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.size());
        q.display();
        System.out.println();
        System.out.println(q.poll());
        q.display();
        System.out.println();
        System.out.println(q.peek());
        System.out.println(q.size());



    }

    int[] arr = new int[5];
    int index =0;

    public void offer(int ele){
        if (index> arr.length){
            return;
        }
        arr[index] = ele;
        index++;
    }

    public int poll(){
        if (index-1 < 0){
            return -1;
        }
        int memory = arr[0];
        for (int i =0; i< arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        index--;
        return  memory;
    }

    public int peek(){
        return arr[0];
    }

    public int size(){
        return  index;
    }

    public void display(){
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

}
