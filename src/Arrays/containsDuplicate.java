package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
//    public boolean containsDuplicate(int[] nums) {
//        for(int i =0 ; i<nums.length;i++){
//            for (int j =i; j< nums.length; j++){
//                if (nums[i] == nums[j]){
//                    return  true;
//                }
//            }
//        }
//        return  false;
//    }

//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i =0 ; i< nums.length; i++){
//            if (nums[i] == nums[i+1]){
//                return  true;
//            }
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i<nums.length;i++){
            if (visited.contains(nums[i])){
                return  true;
            }else {
                visited.add(nums[i]);
            }
        }

        return  false;
    }



    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i =0 ; i<nums.length; i++){
            if (set.contains(nums[i])){
                return  true;
            }
            set.add(nums[i]);
            if (set.size()> k){
                set.remove(nums[i-k]);
            }
        }
       return false;
    }
}
