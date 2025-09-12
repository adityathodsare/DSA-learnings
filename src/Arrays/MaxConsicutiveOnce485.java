package Arrays;

public class MaxConsicutiveOnce485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter =0;
        int ref =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 1 ){
                counter = Math.max(ref, counter);
                ref =0;
            }
            if(nums[i] == 1){
                ref++;
            }
        }
        return Math.max(ref, counter);
    }
}
