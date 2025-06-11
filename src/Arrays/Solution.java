package Arrays;

import java.util.Scanner;

public class Solution {
    public static boolean isPalindrome(int x) {
         StringBuffer stringBuffer1 = new StringBuffer(x);
         String s1 =stringBuffer1.toString();
         StringBuffer stringBuffer2 = stringBuffer1.reverse();
         String s2 = stringBuffer2.toString();
         if (s1.compareTo(s2)== 0){
             return  true;
         }
         return  false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));

    }
}
