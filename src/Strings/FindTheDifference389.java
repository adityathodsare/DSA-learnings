package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheDifference389 {

        public static char findTheDifference(String s, String t) {
            char result = 0;

            // XOR all characters from both strings
            for (char c : s.toCharArray()) {
                result ^= c;
                System.out.println("s "+ result );
            }
            for (char c : t.toCharArray()) {
                result ^= c;
                System.out.println("t "+ result );
            }

            return result;
        }


//    public static char findTheDifference(String s, String t) {
//        Map<Character, Integer> map1 = new HashMap<>();
//        for (char ch : s.toCharArray()){
//            map1.put(ch, map1.getOrDefault(ch,0)+1);
//        }
//        System.out.println(map1);
//
//        Map<Character, Integer> map2 = new HashMap<>();
//        for (char ch : t.toCharArray()){
//            map2.put(ch, map2.getOrDefault(ch,0)+1);
//        }
//
//        System.out.println(map2);
//
//        for (int i =0; i<t.length(); i++){
//            if (map2.get(t.charAt(i)) >0){
//                map1.put(t.charAt(i), map2.get(t.charAt(i))-1);
//            }
//        }
//
//        for (int i =0; i<s.length(); i++){
//            map2.put(s.charAt(i) , map1.get(s.charAt(i)));
//        }
//        System.out.println(map2);
//
//        for (int i =0; i<t.length(); i++){
//            if (map2.get(t.charAt(i)) >0){
//                return t.charAt(i);
//            }
//        }
//
//        return ' ';
//
//    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

}
