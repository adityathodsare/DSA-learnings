package Strings;

public class palindrome1 {
    public static void main(String[] args) {
        String str = "aditya";
        int i =0 ;
        int j = str.length()-1;
        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                System.out.println("not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("ok palindrome");
    }
}
