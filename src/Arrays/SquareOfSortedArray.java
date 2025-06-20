package Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {

    public static void main(String[] args) {
        int arr[]= {-4,-1,0,3,10};
        int[] arr1= sortedSquares(arr);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] sortedSquares(int[] nums) {


        for(int i =0; i< nums.length; i++ ){
            int num = nums[i] * nums[i];
            nums[i] = num;

        }
         Arrays.sort(nums);
        return nums;
    }
}

