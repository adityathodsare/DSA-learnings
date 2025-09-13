package Strings;

import java.util.ArrayList;
import java.util.HashMap;

public class FindMostFrequentVowelAndConstants3541 {
    public int maxFreqSum(String s) {
        ArrayList<Character> constants = new ArrayList<>();
        ArrayList<Character> vowel = new ArrayList<>();

        char vowelcond[] = {'a', 'e', 'i' , 'o', 'u'};
        String vowelc = "aeiou";


        for (int i =0; i<s.length(); i++){
            boolean isvowel = false;
            for (int j =0; j< vowelcond.length; j++){
                if (s.charAt(i) == vowelcond[j]){
                    vowel.add(s.charAt(i));
                    isvowel = true;
                }
            }
            if(!isvowel){
                constants.add(s.charAt(i));
            }
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i =0; i<vowel.size(); i++){
            map1.put(vowel.get(i), map1.getOrDefault(vowel.get(i), 0)+1);
        }

        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i =0; i<constants.size(); i++){
            map2.put(constants.get(i), map2.getOrDefault(constants.get(i), 0)+1);
        }

        int vowelMax = Integer.MIN_VALUE;
        int constantMax = Integer.MIN_VALUE;

        for (int i =0; i<vowel.size(); i++){
            vowelMax = Math.max(vowelMax, map1.get(vowel.get(i)));
        }

        for (int i =0; i<constants.size(); i++){
            constantMax = Math.max(constantMax, map2.get(constants.get(i)));
        }

        if (vowelMax == Integer.MIN_VALUE){
            vowelMax =0;
        }

        if (constantMax == Integer.MIN_VALUE){
            constantMax =0;
        }

        return  vowelMax + constantMax;


    }
}
