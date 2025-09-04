package BinarySearchJAVA;

public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        int startIndex =0;
        int endIndex = nums.length -1 ;
        while (startIndex < endIndex){
            int midIndex = startIndex + (endIndex -startIndex)/ 2;
            if (nums[midIndex] > nums[midIndex + 1 ]){
                endIndex = midIndex;
            }else {
                startIndex = midIndex + 1 ;
            }
        }
        return  startIndex;
    }


}
