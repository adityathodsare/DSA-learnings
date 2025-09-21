package stacks;

public class LinkedListImplementationOfStack {
    static class Node {
        public Node head = null;
        int data ;
        Node nextNode ;
        int size =0;

        public Node(int data) {
            this.data = data;
        }

        public Node(){

        }

        public Node( int data, Node nextNode) {

            this.nextNode = nextNode;
            this.data = data;

        }

        public void push (int data ){
            Node newNode = new Node(data,head);
            head = newNode;
            size++;
        }

        public int pop(){
            size--;
            int val = head.data;
            head = head.nextNode;
            return  val;
        }

        public int peek(){
            return head.data;
        }

        public int size(){
            return  size;
        }

        public static  void main(String[] args) {
            Node node = new Node();
            node.push(1);
            node.push(2);
            node.push(3);
            System.out.println(node.size);
            System.out.println(node.pop());
            System.out.println(node.peek());
            System.out.println(node.size);
            System.out.println(node.size());


        }


    }
}
