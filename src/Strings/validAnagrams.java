package Strings;

import java.util.Arrays;

public class validAnagrams {
    public boolean isAnagram(String s, String t) {
        if (s.length() !=  t.length()){
            return  false;
        }
        char arrs[] = s.toCharArray();
        char arrt[] = t.toCharArray();

        Arrays.sort(arrs);
        Arrays.sort(arrt);

        for (int i =0; i<arrs.length; i++){
            if (arrs[i] != arrt[i]){
                return  false;
            }
        }
        return  true;
    }
}
