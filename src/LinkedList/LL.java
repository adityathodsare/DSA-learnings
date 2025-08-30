package LinkedList;

public class LL {
    Node head;
   class Node {
       String data ;
       Node nextNode ;

       Node(String data){
           this.data = data;
           this.nextNode = null;
       }
   }

   // add element to first place / starting
   public String addElementToFirstPlace(String data){
       Node newNode = new Node(data);
       if (head == null ){
            head = newNode;
            return newNode.data + " first ele";
       }

       newNode.nextNode= head;
       head = newNode;
       return newNode.data;
   }

   // add element to last element / ending
    public String addElementToLastPosition(String data){
       Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           return newNode.data + " new ele";
       }
       Node currentNode = head;
       while(currentNode.nextNode != null){
           currentNode = currentNode.nextNode;
       }

       currentNode.nextNode = newNode;

       return currentNode.nextNode.data;

    }

    // print whole list
    public void printWholeLL(){
       Node currentNode = head;
       while (currentNode != null){
           System.out.print(currentNode.data +" ->");
           currentNode= currentNode.nextNode;
       }
    }

    // delete operation
    // delete first
    public void deleteFirstElement(){
       if (head == null){
           System.out.println("LL is empty");
       }else {
           head = head.nextNode;
       }
    }

    // deleting last ele
    public void deleteLastELe(){
        if (head == null){
            System.out.println("LL is empty");
        }else {
            Node currentNode = head;
            while(currentNode.nextNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            Node tails = currentNode;
            tails.nextNode = null;

        }
    }

    //size of linked list
    public int sizeOfLinkedList(){
       int counter = 0;
       if (head == null){
           return counter;
       }else {
           Node current = head;
           while(current != null){
               counter++;
               current = current.nextNode;
           }
       }
       return  counter;
    }


    public static void main(String[] args) {
        LL list = new LL();
        LL list1 = new LL();
        System.out.println(list.addElementToFirstPlace("aditya"));
        System.out.println(list.addElementToFirstPlace("amol"));
        System.out.println(list1.addElementToLastPosition("aditya"));
        System.out.println(list1.addElementToLastPosition("amol"));
        list.printWholeLL();
        System.out.println();
        list1.printWholeLL();
        list1.deleteFirstElement();
        System.out.println();
        list1.printWholeLL();
        System.out.println();
        list.deleteLastELe();
        list.printWholeLL();
        System.out.println();
        list.addElementToLastPosition("thodsare");
        System.out.println();
        list.printWholeLL();
        System.out.println();
        System.out.println(list.sizeOfLinkedList());


    }
}
