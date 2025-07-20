package slidingW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class contains_duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        nums = [1,2,3,1], k = 3
//        Output: true
       Set<Integer> set = new HashSet<>();

        for (int i =0; i<nums.length; i++){
            if (set.contains(nums[i])){
                return  true;
            }
            set.add(nums[i]);
            if (set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return  false;
    }
}
