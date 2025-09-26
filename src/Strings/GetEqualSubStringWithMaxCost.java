package Strings;

public class GetEqualSubStringWithMaxCost {
    public int equalSubstring(String s, String t, int maxCost) {
        StringBuilder sb = new StringBuilder();
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        for (int i=0; i<sarr.length; i++){
            int diff = getAscii(tarr[i]) - getAscii(sarr[i]) ;
            if ( diff <= maxCost){
                maxCost= maxCost-diff;
                sb.append(tarr[i]);
            }else {
                continue;
            }
        }
        return  sb.length();
    }
    public int getAscii(char c ){
        return c-'a';
    }
}
