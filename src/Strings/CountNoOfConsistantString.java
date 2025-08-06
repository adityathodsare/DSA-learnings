package Strings;

import java.util.*;

public class CountNoOfConsistantString {

    public int countConsistentStrings(String allowed, String[] words) {
        int counter =0;
        Set<Character> set = new HashSet<>();
        for(int i =0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }

        for (String s: words){
            boolean flag = true;
            for (int i =0; i<s.length(); i++){
                if (! set.contains(s.charAt(i))){
                    flag =false;
                }

            }
            if (flag){
                counter++;
            }
        }
        return counter;
    }
}
