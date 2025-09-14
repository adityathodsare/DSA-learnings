package Strings;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        String s = "aditya";
        System.out.println(s.substring(0,s.length()));
        System.out.println(isPalindrome("aditya"));
    }
    public String longestPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }
        int start =0;
        int end = s.length()-1 ;
        while(start < end ){
            String s1=s.substring(start,end+1);
            if (isPalindrome(s1)){
                System.out.println("1");
                return s1;
            }
            start++;
            s1 = s.substring(start,end+1);
            if (isPalindrome(s1)){
                System.out.println("2");
                return s1;
            }
            end--;
            s1 = s.substring(start,end+1);
            if (isPalindrome(s1)){
                System.out.println("3");
                return s1;
            }
        }
        return  String.valueOf(s.charAt(0));
    }

    public static Boolean isPalindrome(String s ){
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.toString();
        StringBuilder sb1 = sb.reverse();
        String s2 = sb1.toString();
        if (s1.equals(s2)){
            return  true;
        }
        return false;
    }
}
