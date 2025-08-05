package Strings;

import java.util.*;

public class longestSubStringWithoutRepetation {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start =0;
        int max = 0;
        for (int end =0; end<s.length(); end++){
            if (map.containsKey(s.charAt(end) ) && map.get(s.charAt(end))>=start){
                start = map.get(s.charAt(end))+1;
                System.out.println("start: "+start);
            }
            map.put(s.charAt(end), end);
            System.out.println(map);
            max = Math.max (max, end-start+1);
            System.out.println(max);
        }
        return  max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
