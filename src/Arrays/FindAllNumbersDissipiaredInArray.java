package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDissipiaredInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        List<Integer> dissapiared = new ArrayList<>();
        for (int i =0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for (int i =1; i<=nums.length; i++){
            if (!map.containsKey(i)){
                dissapiared.add(i);
            }
        }
        return  dissapiared;
    }
}
