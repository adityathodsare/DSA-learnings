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
        int n = nums.length;
        int arr[]= new int [n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int sufix=1;
        for(int i= n-1;i>-1;i--){
            arr[i]*=sufix;
            sufix*=nums[i];
        }

        return arr;
    }
}
