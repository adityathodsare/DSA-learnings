package Strings;

public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        return 0;
    }

    public static String isnumeric(String s ){
        StringBuilder sb = new StringBuilder(s);
        for (int i =0; i<s.length(); i++ ){
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i)!='-' || s.charAt(i)!='+'){
                i++;
               continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isnumeric("1337c0d3"));
    }
}
