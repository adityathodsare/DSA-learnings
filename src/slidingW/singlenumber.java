package slidingW;

import java.util.*;

public class singlenumber {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2};
        System.out.println("ans "+singleNumber(arr));
//        for (int num : arr){
//            System.out.println(num);
//        }
    }
    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0 ; i<nums.length; i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }
}
