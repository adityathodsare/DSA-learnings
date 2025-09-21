package stacks;

import java.util.Stack;

public class ArrayImplementationOfStacks {
    class Stacks{
        static int[] arr = new int[5];
        static int  index = 0;

        public static  void push(int ele){
            arr[index]  =  ele;
            index++;
        }

        public static int pop (){
            if (index == 0){
                return  -1;
            }
            int top = arr[index-1];
            arr[index-1] = 0;
            index--;
            return top;
        }

        public static  int peek(){
            if (index == 0){
                return  -1;
            }
            int top = arr[index-1];
            return top;
        }
        
        public static void display(){
            for (int i =0; i<index; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        public static int size(){
            return  index;
        }
        public static  Boolean isEmpty(){
            if(size() == 0){
                return true;
            }
            return  false ;
        }
    }

    public static void main(String[] args) {
        Stacks.push(1);
        Stacks.push(2);
        System.out.println(Stacks.pop());
        System.out.println(Stacks.peek());
        Stacks.push(2);
        Stacks.push(3);
        Stacks.push(4);
        Stacks.push(5);
        Stacks.display();
        System.out.println(Stacks.peek());
        System.out.println(Stacks.size());
        Stacks.pop();
        Stacks.pop();
        Stacks.pop();
        Stacks.pop();
        Stacks.pop();
        System.out.println( Stacks.size());
        System.out.println(Stacks.isEmpty());

    }
}
