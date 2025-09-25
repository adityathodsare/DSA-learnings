package Strings;

import java.util.HashMap;
import java.util.Map;

public class cheakIfAllCharecterHaveEqualNumberOfOccurance1941 {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        int arr[] = new  int[s.length()];
        int index = 0;
        for (char i : s.toCharArray()){
            arr[index++] = map.get(i);
        }

        if (arr[0] == arr[arr.length-1]){
            return  true;
        }
        return false;
    }
}
