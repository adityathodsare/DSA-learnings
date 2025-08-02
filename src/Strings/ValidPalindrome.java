package Strings;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1 ;
        while(i<j){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (! isAlphanumeric(c1)){
                i++;
                continue;
            }

            if (! isAlphanumeric(c2)){
                j--;
                continue;
            }
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                    return  false;
            }
        }
        return  true;
    }

    private boolean isAlphanumeric(char c) {
        if (c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9'){
            return  true;
        }
        return  false;
    }
}
