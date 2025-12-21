package hummingbirdRivision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twosum {

     // brute force
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i =0; i<nums.length; i++){
            for (int j=0; j < nums.length; j++ ){
                if (j==i){
                    continue;
                }else if(nums[i] + nums[j] == target) {
                    arr[1] = i;
                    arr[2] = j;
                }else {
                    continue;
                }
            }
        }
        Arrays.sort(arr);
        return  arr;
    }
    // optimized  here with hashmap
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< nums.length; i++){
            int diff = target - nums[i] ;
            if (map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }else {
                map.put(nums[i], i);
            }
        }
        return  null;
    }


}
