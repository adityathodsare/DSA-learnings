package Strings;

import java.util.*;

public class havingAnagram {
    public boolean isAnagram1(String s, String t) {
        int[] frq = new int[26];

        for (char c : s.toCharArray()){
            int index = c - 'a';
            frq[index] += 1;
        }

        for (char c : t.toCharArray()){
            int index = c - 'a';
            frq[index] -= 1;
        }

        for (int i =0; i<26 ; i++){
            if (frq[i] != 0){
                return false;
            }
        }
        return true;
    }


    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return  false;
        }
        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0 ; i<s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
        }
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0 ; i<t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
        }

        return map1.equals(map2);
    }

    public static void main(String[] args) {

    }
}
