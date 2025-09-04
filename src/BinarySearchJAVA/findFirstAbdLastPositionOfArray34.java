package BinarySearchJAVA;

public class findFirstAbdLastPositionOfArray34 {
    // brute force
    public int[] searchRange1(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int first =-1;
        int last =-1;
        int res[] = new int[2];
        for (int i =0; i<nums.length-1; i++){
            if (nums[i] == target){
                    first =i;
                    break;
            }
        }
        for (int i = nums.length-1; i<0; i--){
            if (nums[i] == target){
                    last =i;
                    break;
            }
        }
        if (first != -1){
            last = first;
        }
        res[0] = first;
        res[1] = last;

        return res;

    }


    public int[] searchRange(int[] nums, int target) {
        int [] ansArr = {-1, -1};
        int start = searchOccurance(nums,target,true);
        int end = searchOccurance(nums,target,false);
        ansArr[0] = start;
        ansArr[1] = end;
        return ansArr;
    }

    public int searchOccurance(int nums[], int target , boolean isfindingFirstOccurance){
        int start =0;
        int end = nums.length-1;
        int ans = -1 ;
        while(start <=  end){
            int mid = start +(end -start)/2;
            if (target < nums[mid]){
                end = mid -1;
            }else if (target > nums[mid]){
                start = mid +1 ;
            }else{
                ans = mid;
                if (isfindingFirstOccurance){
                    end = mid -1;
                }else {
                    start = mid +1 ;
                }
            }
        }
        return  ans ;
    }
}
