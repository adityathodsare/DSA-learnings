package Strings;

import java.util.*;

public class longestSubStringWithoutRepetation {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0){
            return 0;
        }
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i<s.length(); i++){
            if (! map.containsKey(s.charAt(i))){
                map.put( s.charAt(i), map.getOrDefault(s.charAt(0),max)+1);
            }
            max =Math.max(max,map.size());
            return max;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
