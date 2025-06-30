package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class two_sum {

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum1(arr,6)));
    }
    public static int[] twoSum1(int[] arr, int target) {
        int i =0;
        int j =arr.length-1;
       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(i<=j){
             if (arr[i]+arr[j] < target) {
                i++;
            }
            else if (arr[i]+arr[j] > target) {
                j--;
            }
            else{

                return new int[] {i,j};
            }
        }
        return null;
    }

    /*
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
     */

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++ ){

            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i],i);
        }

        return  null ;
    }

}
