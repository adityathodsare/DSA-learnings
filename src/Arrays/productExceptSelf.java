package Arrays;

public class productExceptSelf {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4};
        int ans [] = productExceptSelf(nums);
        for (int num : ans){
            System.out.println(num);
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        for (int i =0 ; i< nums.length; i++ ){
           nums[i] =1;
            for (int j = 0; j< nums.length; j++){
               if (nums[i]== nums[j]){
                   continue;
               }
                nums[i] = nums[i]*nums[j];
            }

        }
        return nums;
    }
}
