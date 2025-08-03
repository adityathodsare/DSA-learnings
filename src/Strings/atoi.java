package Strings;

public class atoi {
    public static  int myAtoi(String s) {
        StringBuilder sb = new StringBuilder("");
        Integer res = 0;
        s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if (isalpha(s.charAt(i))){
//                if (s.charAt(i) == '-' || s.charAt(i) == '+' || s.charAt(i) == ' '){
//                    continue;
//                }
                if (isfirstOccurenceOfNegative(s)){
                    continue;
                }
                break;
            }else {

                if (isfirstOccurenceOfNegative(s)){
                    continue;
                }
                if (i>0 && s.charAt(i-1)>= '0' && s.charAt(i-1)<=9 ){
                    break;
                }
                sb.append(s.charAt(i));
            }
        }
        if (sb.isEmpty()){
            return res;
        }else {
            res = res + Integer.valueOf(sb.toString());
        }

        return isNegative(s,res);
    }
    public static boolean isalpha(char s){
        if (s>= 'a' && s<= 'z' || s>='!' && s<= '/'|| s== ' '){
            return true;
        }
        return false;
    }

    public static  int isNegative(String s, Integer res){

        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == ' '){
                continue;
            }else {
                if (s.charAt(i) == '-'){
                    res *= -1;
                    return res;
                }
            }
        }
        return res;
    }
    public static  boolean isfirstOccurenceOfNegative(String str){
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                continue;
            }else {
                if (str.charAt(i) == '-'){
                    return true;
                }else {
                    return  false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
    }
}
