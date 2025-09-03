package BinarySearchJAVA;

import java.util.Arrays;

public class FloorOfTheArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,16,7,8,10};
        System.out.println(floorOfTheArrayNumber(arr,9));
    }
    public static int floorOfTheArrayNumber(int arr[], int target){
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if (arr[mid] == target){
                return  arr[mid];
            }
            if (target > arr[mid]){
                start = mid + 1;
            }else {
                end = mid -1 ;
            }
        }
        return arr[end];
    }
}
