package Strings;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
//    public static  int reverse(int x) {

//        if (x>Integer.MAX_VALUE/2){
//            return 0;
//        }
//        boolean isNegative = x<0;
//        String str = String.valueOf(Math.abs(x));
//        StringBuilder stringBuilder = new StringBuilder(str);
//        String rev = stringBuilder.reverse().toString();
//        int res = Integer.parseInt(rev);
//        if (isNegative){
//            return -res;
//        }else {
//            return res;
//        }


//    }


    public static  int reverse(int x) {
        int rev = 0;
        int digit =  x%10;

        while (x!=0){

            if(rev > Integer.MAX_VALUE/10){
                return 0;
            }

            if(rev == Integer.MAX_VALUE/10 && digit > 7){
                return 0;
            }

            if(rev < Integer.MIN_VALUE/10){
                return 0;
            }

            if(rev == Integer.MIN_VALUE/10 && digit < -8){
                return 0;
            }


            rev = rev *10 + digit ;
            x = x/10;
        }

        return  rev;

    }
}
