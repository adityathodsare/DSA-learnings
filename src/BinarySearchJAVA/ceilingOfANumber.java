package BinarySearchJAVA;

import java.util.Arrays;

public class ceilingOfANumber {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,16,7,8,9,10};
        System.out.println(approach1(arr,5));
        System.out.println(approach2(arr,5));

    }

    // approach 1
    public static int approach1(int[] arr , int target ){
        Arrays.sort(arr);
        for (int num : arr){
            if (num >= target){
                return num;
            }
        }
        return -1;
    }
    // approach 2
    public static int approach2(int arr[], int target ){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int startIndex =0;
        int endIndex = arr.length-1;
        while(startIndex  <=  endIndex){
            int mid = startIndex + (endIndex-startIndex )/ 2;
            if (target > arr[mid] ){
                startIndex = mid + 1 ;
            }else if (target < arr[mid] ){
                endIndex = mid -1;
            }else if (arr[mid] == target){
                return  arr[mid];
            }
        }
        return  arr[startIndex];

    }
}
