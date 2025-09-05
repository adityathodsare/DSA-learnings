package Recursion;

public class fibonachiSeries {
    public static void main(String[] args) {
        printFibo(1);
    }

    public static  void printFibo(int start){


        int temp =0;
        int fib = temp + start;
        temp++;
        System.out.println(fib);

        if (fib > 10){
            return;
        }
        printFibo(fib);

    }
}
