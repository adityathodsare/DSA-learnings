package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class productOfsubArry {
    public int maxProduct(int[] nums) {
        int ans = 1;
       int[] arr = new int[nums.length];
        for (int i =0; i<nums.length; i++){
            for (int j = 0 ; j<i ; j++){
                ans = ans *nums[i];
            }

           arr[i]= ans;

        }
        Arrays.sort(arr);
        return arr[nums.length-1];



    }
}
