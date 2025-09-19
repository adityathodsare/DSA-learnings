package LinkedList;

public class CreateADeepCopyOfLinkedList {
    static  class Node {
        int data ;
        Node nextNode;
        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        a.nextNode = b;
        b.nextNode = c ;
        printWholeLinkedList(a);
        printWholeLinkedList(deepCopyOfLinkedLst(a));
    }

    public static  Node deepCopyOfLinkedLst(Node head ){
        Node head2 = new Node(100);
        Node temp1 = head ;
        Node temp2 = head2;

        while(temp1 != null){
            Node n = new Node(temp1.data);
            temp1 = temp1.nextNode;
            temp2.nextNode = n;
            temp2 = temp2.nextNode;
        }

        head2 = head2.nextNode;
        return  head2;

    }

    public static void printWholeLinkedList(Node head ){
        while(head != null){
            System.out.print(head.data + " -->");
            head = head.nextNode;
        }
        System.out.print(" null");
        System.out.println();
    }

}
