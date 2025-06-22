package Strings;

public class basics {
    public static void main(String[] args) {

        char[] arr = {'q','w','e','r'};
        System.out.println(reverseString(arr));
//        char [] arr  = {'h','e','l','l','o'};
//        String str = new String(arr);

    }

    public static char[] reverseString(char[] s) {


        String str = new String(s);
        StringBuffer sb1 = new StringBuffer(str);
        String s1 = sb1.toString();
        StringBuffer sb2 = new StringBuffer(s1);
        String s2 =sb2.reverse().toString();


        char result [] = s2.toCharArray();
        return result;


    }

}
