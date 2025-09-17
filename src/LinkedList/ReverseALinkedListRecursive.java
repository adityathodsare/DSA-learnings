package LinkedList;

public class ReverseALinkedListRecursive {
    public static  class Node {
        int data ;
        Node nextNode ;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node (20);
        Node c = new Node (30);
        a.nextNode = b;
        b.nextNode= c;
        display(a);
        a = RecursiveReversalOfLinkedList(a);
        display(a);
    }

    public static  void display (Node head ){
        if (head == null){
            System.out.println("null");
            return;
        }
        System.out.print(head.data + " -> ");
        display(head.nextNode);
    }

    public static Node RecursiveReversalOfLinkedList(Node head ){
        if (head.nextNode == null) {
            return head;
        }
        Node newNode = RecursiveReversalOfLinkedList(head.nextNode);
        head.nextNode.nextNode = head;
        head.nextNode = null;
        return newNode;
    }
}
