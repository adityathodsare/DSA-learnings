package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        char [] arr = s.toCharArray();
        for (int i =0; i< arr.length; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }
        for (int i =0; i< arr.length; i++){
           if(!Objects.equals(map.get('('), map.get(')'))){
                return  false;
           }
           if (!Objects.equals(map.get('{'), map.get('}'))){
               return  false;
           }
            if (!Objects.equals(map.get('['), map.get(']'))){
                return  false;
            }
        }
        return  true;
    }
}
