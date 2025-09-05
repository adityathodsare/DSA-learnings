package Arrays;

public class SearchInserPosition {
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<= end ){
            int mid = start + (end -start)/2;
            if (nums[mid] > target){
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid +1 ;
            } else if (nums[mid] == target) {
                return mid;
            }else {
                for (int i =0; i<nums.length; i++){

                    if( target<nums[i]){
                        return i;
                    }
                }
            }
        }
        // value is not present
        return nums.length-1;
    }
    public int searchInsert1(int[] nums, int target) {
        for (int i =0; i<nums.length; i++){
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
