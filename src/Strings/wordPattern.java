package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class wordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        Map <Character, String> hm = new HashMap<>();
        hm.put('a', "dog");
        hm.put('b', "cat");
    }
    public static boolean wordPattern(String pattern, String s) {
        String sarr [] = s.split(" ");
        if (pattern.length() != sarr.length){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for (int i =0; i<pattern.length(); i++){
            set.add(pattern.charAt(i));
        }
        Set<String> set1 = new HashSet<>();
        for (int i =0; i<sarr.length; i++){
            set1.add(sarr[i]);
        }
        if (set.size() != set1.size()){
            return  false;
        }
        Map<Character , String> map = new HashMap<>();
        for (int i =0; i<pattern.length(); i++){
            if (set.contains(pattern.charAt(i))){
                map.put(pattern.charAt(i),sarr[i]);
                set.remove(pattern.charAt(i));
            }
        }
        System.out.println(set);
        System.out.println(set1);
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i<pattern.length(); i++){
            if (sb.length() == 0){
                sb.append(map.get(pattern.charAt(i)));
            }else{
                sb.append(" "+map.get(pattern.charAt(i)));
            }
        }
        System.out.println(map);
        if (sb.toString().equals(s)){
            System.out.println(sb.toString());
            System.out.println(s);
            return true;
        }
        return  false;
    }
}
