package Arrays;

import java.util.Arrays;

public class minimum_mumber_game {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3};
        int result []= numberGame(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
       int i = 0 ;
       int j = 1;
       while(j<=nums.length-1){
           int temp = nums[i];
           nums[i] = nums[j];
           nums[j] = temp;
           i= i+2;
           j=j+2;

       }
       return  nums;
    }


}
