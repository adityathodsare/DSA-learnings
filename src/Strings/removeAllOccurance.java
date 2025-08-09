package Strings;

public class removeAllOccurance {
//    public String removeOccurrences(String s, String part) {
//
//    }daabcbaabcbc => dabaabcbc /dabcbaacbc
public static void main(String[] args) {
    System.out.println(removeCharOccurance("daabcbaabcbc","abc"));
}
    public static boolean isPresent(int i, String s, String part){
    String newS= s.substring(i,part.length()+i);
        for (int j =0; j<newS.length(); j++){
            if (newS.charAt(j) != part.charAt(j)){
                return false;
            }
        }
        return  true;
    }

    public static String removeCharOccurance(String s, String part){
        int i =0;
        int n = s.length();
        int j =0;
        int p = part.length();
        StringBuilder sb = new StringBuilder(s);
        while(i<n){

            int currentIndex = i;
            if (s.charAt(i) == part.charAt(j)){
                if (isPresent(i,s,part) && i == s.length()-n){
                    sb.substring(0,i);
                    return sb.toString();
                } else if (isPresent(i,s,part)) {
                    sb.delete(i,i+n);
                    i++;
                }

            }
            i++;

        }
        return sb.toString();
    }
}
