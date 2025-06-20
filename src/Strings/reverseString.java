package Strings;

public class reverseString {
    public static void main(String[] args) {
        System.out.println( isPalindrome(123));
    }




        public String reverseWords(String s) {
            String str [] = s.trim().split("\\s+");
            String out = "";
            for(int i = str.length-1; i>0; i-- ){
                out = out+str[i] + " ";
            }

            return out+str[0];
        }


    public static boolean isPalindrome(int x) {
        StringBuffer sb1 = new StringBuffer(String.valueOf(x));
        String str1 = sb1.toString();
        StringBuffer sb2 = sb1.reverse();
        String str2 = sb2.toString();
        if (str2.compareTo(str1) == 0 ){
            return true;
        }

        return  false;

    }

}
