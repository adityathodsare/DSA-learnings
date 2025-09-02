package BinarySearchJAVA;

import java.util.Arrays;

public class BinarySearchAlgoCode {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,10,23,4,56,78,456,768,6453,43,3};
        System.out.println(binarySearch(arr,987456));
    }
    public static Boolean binarySearch(int[] arr, int target  ){
        Arrays.sort(arr);
        int startingIndex = 0;
        int endingIndex = arr.length-1;
        while(startingIndex<=endingIndex){
            int mid =(startingIndex +(( endingIndex -startingIndex) / 2) );
            if (target > arr[mid]){
                startingIndex = mid+1 ;
            }else if (target < arr[mid]){
                endingIndex = mid-1;
            } else if (target  == arr[mid]) {
                return  true;
            }else {
                return false;
            }

        }
        System.out.println("forced  return ");
        return false;
    }
}
