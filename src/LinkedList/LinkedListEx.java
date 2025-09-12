package LinkedList;
public class LinkedListEx {
    int size =0 ;
    Node head;
    Node tails ;
    class Node {
        int data ;
        Node nextNode ;
        Node(int data ){
            this.data = data  ;
            this.nextNode = null;
        }
    }

    public  void insertToFirst(int data ){
        Node newNode = new Node (data);
        size++;
        if (head == null){
            head = newNode ;
            return;
        }
        newNode.data = data;
        newNode.nextNode = head;
        head = newNode ;
        if (tails == null){
            tails = head;
        }
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        size++;

//        Node replicaOfHead = head;
//        while(replicaOfHead.nextNode != null){
//            replicaOfHead = replicaOfHead.nextNode;
//        }
//        replicaOfHead.nextNode = newNode;
        if (tails == null){
            insertToFirst(data);
            return;
        }
        tails.nextNode = newNode;
        tails = newNode;


    }

    public void printAllElements(){
       Node replicaOfHead = head ;
       while(replicaOfHead != null){
           System.out.println(replicaOfHead.data);
           replicaOfHead = replicaOfHead.nextNode;
       }
    }

    public static void main(String[] args) {
        LinkedListEx ll1 = new LinkedListEx();
        ll1.insertLast(10);
        ll1.insertLast(20);
        ll1.insertLast(30);
        ll1.insertLast(40);
        System.out.println(ll1.size);
        ll1.printAllElements();

    }
}
