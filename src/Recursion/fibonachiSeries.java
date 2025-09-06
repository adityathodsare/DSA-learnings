package Recursion;

public class fibonachiSeries {
    public static void main(String[] args) {
        System.out.println(printFibo(6));
    }

    public static  int printFibo(int n){
        if (n<=0){
            return 0;
        }else if (n == 1){
            return  1;
        }
        int a = printFibo(n-1);
        int b = printFibo(n-2);
       return a+b;
    }
}
