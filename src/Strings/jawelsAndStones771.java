package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class jawelsAndStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        char stonesArr[] = stones.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i =0; i<stonesArr.length; i++){
            map.put(stonesArr[i] , map.getOrDefault(stonesArr[i] , 0)+1);
        }
        int sum = 0;
        for (int i =0;i<jewels.length(); i++){
            if (map.get(jewels.charAt(i)) == null){
                continue;
            }
            sum = sum+ map.get(jewels.charAt(i));
        }
        return  sum;
    }

    public int numJewelsInStones2(String jewels, String stones) {
        int res =0;
        Set<Character> set = new HashSet<>();
        for (char i : jewels.toCharArray()){
            set.add(i);
        }
        for (char i : stones.toCharArray()){
            if (set.contains(i)) res++;
        }
        return  res;
    }
}
