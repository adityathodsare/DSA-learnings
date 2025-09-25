package Arrays;

import java.util.HashMap;
import java.util.Map;

public class sumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for (int i=0; i< nums.length; i++){

            if (map.get(nums[i]) != null && map.get(nums[i]) == 1){
                sum += nums[i];
                map.remove(nums[i]);
            }else {
                map.remove(nums[i]);
            }
        }
        return sum;
    }
}
