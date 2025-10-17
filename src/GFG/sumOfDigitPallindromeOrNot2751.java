package GFG;

public class sumOfDigitPallindromeOrNot2751 {
    // User function Template for Java
    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(56));
    }


    static boolean  isDigitSumPalindrome(int n) {
            // code here
            int ref = n;
            int addition =0;
            while(ref >0){
                int digit = ref%10;
                System.out.println(digit);
                addition = addition + digit ;
                ref = ref /10;
            }
            System.out.println(addition);
            // 56 --> 11
            int refadd = addition ;
            int check = 0;

            while(refadd > 0){
                int digitcheck = refadd%10;
                check = check *10+ digitcheck ;
                refadd = refadd /10;
            }
        System.out.println(check);

            if(check == addition  ){
                return true ;
            }
            return false ;
        }

}
