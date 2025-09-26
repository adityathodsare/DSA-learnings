package Queue;

public class ArrayImplimentationFrontRear {

    public static void main(String[] args) {
        ArrayImplimentationFrontRear q = new ArrayImplimentationFrontRear();
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
    int f =-1;
    int r = -1 ;
    int arr [] = new int[5];
    int size =0;
    public void offer(int val){
        if (r == arr.length-1){
            return;
        }
        if (f==-1){
            f=0;
            arr[++r] = val;

        }else {
            arr[++r] = val;
        }
        size++;
    }

    public int poll(){
        int x = arr[f++];
        size--;
        return x ;
    }

    public int peek(){
        return arr[f];
    }

    public int size(){
        return  size;
    }

    public void display(){
        for (int i =f ; i<=r; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
