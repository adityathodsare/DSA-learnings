package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersectionOfArrays {

    public static void main(String[] args) {
        int a = Integer.valueOf("15");
        System.out.println(a
        );
    }
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> arr = new HashSet<>();

        for (int i = 0; i<nums1.length; i++){
            for (int j = 0 ; j<nums2.length; j++){
                if (nums2[j] == nums1[i]){
                    arr.add(nums2[j]);
                }
            }
        }

        int[] result = new int[arr.size()];
        int index = 0 ;
        for(int rnum : arr){
            result[index++] = rnum;
        }

        return result;


    }

    // duplicate allowed
    public int[] intersect1(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        for (int i =0 ; i<nums1.length; i++ ){
            for (int j = 0 ; j<nums2.length ; j++){
                if (nums2[j] == nums1[i]){
                    arr.add(nums2[j]);
                    break;
                }
            }
        }

        int[] result = new int[arr.size()];
        int index = 0;
        for (int num : arr){
            result [index++] = num;
        }

        return  result;
    }


    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> a1 = new ArrayList<>();
        for (int num : nums1 ){
            a1.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int nums : nums2 ){
            if (a1.contains(nums)){
                result.add(nums);
                a1.remove((Integer) nums);
            }
        }


        int arr [] = new int[result.size()];
        int index = 0 ;
        for (int n : result){
            arr[index++] = n;
        }

        return  arr;
    }
}


/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int num: nums1){
            set1.add(num);
        }
        Set<Integer> rset = new HashSet<>();
        for(int num: nums2){
            if (set1.contains(num)){
                rset.add(num);
            }
        }
        int[] res = new int[rset.size()];
        int i =0;
        for(int num : rset){
            res[i++] = num;
        }
        return res;

    }
}
 */
