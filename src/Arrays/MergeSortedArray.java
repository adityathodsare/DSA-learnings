package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        //[1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        List<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < m ; i++ ){
            arr.add(nums1[i]);
        }
        for (int i = 0 ; i<n ; i++ ){
            arr.add(nums2[i]);
        }
//        int[] res = new int[m+n];
        int index = 0 ;
        for (int resv : arr){
            nums1[index++] = resv;
        }

        Arrays.sort(nums1);
        for (int i : nums1){
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {

        int num1[] = {1,2,3,0,0,0};
        int num2[] = {2,5,6};
        merge(num1,3,num2,3);
    }
}
