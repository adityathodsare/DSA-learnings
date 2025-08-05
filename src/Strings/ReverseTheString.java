package Strings;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "madam";
        int i = str.length()-1;
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
