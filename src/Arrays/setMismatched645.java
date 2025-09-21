package Arrays;

import java.util.HashMap;
import java.util.Map;

public class setMismatched645 {
    public int[] findErrorNums1(int[] nums) {
        int arr[] = new int[2];

        if (isIncreasing(nums)){
            int store = nums[0];
            for (int i =0; i<nums.length; i++){
                if (nums[0] != 1) {
                    arr[0] = nums[0];
                    arr[1] = nums[1]-1;
                    return  arr;
                }
                if (store+i != nums[i]){
                    arr[0] = nums[i] ;
                    arr[1] = store+i ;
                    return arr;
                } else {
                    continue;
                }
            }
        }else {
            int store = nums[nums.length-1];
            for (int i = nums.length-1 ;i>0; i--){
                if (nums[nums.length-1] != 1) {
                    arr[0] = nums[nums.length-1];
                    arr[1] = nums[nums.length-2]-1;
                    return  arr;
                }
                if (store+i != nums[i]){
                    arr[0] = nums[i] ;
                    arr[1] = store+i ;
                    return arr;
                } else {
                    continue;
                }
            }
        }


        return  arr;
    }
    public Boolean isIncreasing(int[] nums){
        if (nums[0] < nums[nums.length-1] && nums[0] < nums[1] ){
            return  true;
        }
        if(nums[0] == nums[1]){
            return  true ;
        }
        return  false;
    }


    public int[] findErrorNums(int[] nums) {
       Map<Integer , Integer> map = new HashMap<>();
       int arr [] = new int[2];
       for (int i =0; i<nums.length; i++){
           map.put(nums[i],map.getOrDefault(nums[i], 0)+1 );
       }
       for (int i=0; i< nums.length; i++){
            if (map.get(nums[i])> 1){
                arr[0]= nums[i];
                break;
            }
       }

       for (int i =1; i<=nums.length; i++){
           if (!map.containsKey(i)){
               arr[i] = i;
           }else{
               arr[i] =0;
           }
       }
       return  arr;

    }
}
