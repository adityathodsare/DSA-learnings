package hummingbirdRivision;

import java.util.HashMap;
import java.util.Map;

public class maximumSubArray {
//    public int maxSubArray(int[] nums) {
//        int maxNumber = Integer.MIN_VALUE;
//
//    }
        public static int singleNumber(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i =0; i<nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            for (int i =0; i<nums.length; i++){
               if ( map.get(nums[i]) == 1){
                   return nums[i];
               }
            }
            return  -1;

        }
}
