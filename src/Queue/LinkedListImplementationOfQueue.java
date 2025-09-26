package Queue;

public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        LinkedListImplementationOfQueue q = new LinkedListImplementationOfQueue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.display();
        System.out.println();
        System.out.println(q.poll());
        q.display();
        System.out.println();
        System.out.println(q.peek());
        q.display();
        System.out.println();
        System.out.println(q.size());
    }
      int size = 0;
    public class Node {

        int data ;
        Node nextNode ;
        public Node() {

        }
        public Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    public void offer(int val){
        Node dummy = new Node(val);
        if (size == 0){
            head = tail = dummy;
        }else{
            tail.nextNode = dummy;
            tail = dummy;
        }
        size++;
    }

    public int poll(){
        int memo = head.data;
        head = head.nextNode;
        size--;
        return memo;
    }

    public int peek(){
        return  head.data;
    }
    public int size (){
        return  size;
    }

    public void display (){
        Node dummy = head ;
        while(dummy != null){
            System.out.print( dummy.data+" ");
            dummy = dummy.nextNode;
        }
    }


}
