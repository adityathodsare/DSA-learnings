package Strings;

public class mergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder("");
        int i =0;
        while (i<word1.length() || i<word2.length()){
            if(i<word1.length() ){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length() ){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();

    }

    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int refindex;
            if (word1.length() >= word2.length()){
                refindex = word1.length();
            }else{
                refindex = word2.length();
            }
            // stringBuilder
            StringBuilder sb = new StringBuilder("");
            // loop
            for (int i =0 ; i<refindex ; i++){
                if (i<word1.length()){
                    sb.append(word1.charAt(i));
                }
                if (i<word2.length()){
                    sb.append(word2.charAt(i));
                }
            }
            return  sb.toString();
        }
    }
}
