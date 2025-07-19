package TP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();

       for (int i =0; i<nums.length; i++){
           if (i==0 || nums[i]==nums[i-1]){
               result.add(nums[i]);
               continue;
           }
       }
      int[] arr =  result.stream().mapToInt(Integer::intValue).toArray();
       return  arr.length;
    }
}
