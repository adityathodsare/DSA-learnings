package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestNumberFrom2Arry {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int r1,r2;

        if (nums1[0]<nums2[0]){
             r1 = nums1[0];
             r2 = nums2[0];
        }else {
             r2 = nums1[0];
             r1 = nums2[0];
        }
        String n1 = String.valueOf(r1);
        String n2 = String.valueOf(r2);
        String results = n1+n2;
        int result = Integer.valueOf(results);

        ArrayList<Integer> duplicate1  = new ArrayList<>();
        for (int num: nums1){
            duplicate1.add(num);
        }
        for (int num1: nums2){
            if (duplicate1.contains(num1)){
                return num1;
            }

        }

        return  result;
    }
}
