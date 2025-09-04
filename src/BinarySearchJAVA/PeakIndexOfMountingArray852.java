package BinarySearchJAVA;

public class PeakIndexOfMountingArray852 {
    public int peakIndexInMountainArray1(int[] arr) {
        int maxHeight = Integer.MIN_VALUE;
        int maxHeightIndex =0;
        for (int i =0; i<arr.length; i++){
            if (maxHeight < arr[i]){
                maxHeight = arr[i];
                maxHeightIndex = i;
            }
        }
        return  maxHeightIndex;
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start < end ){
            int mid = start +(end -start)/2;
            if (arr[mid] > arr[mid+1]){
                end =mid;
            }
            if (arr[mid] < arr[mid-1]) {
                start = mid + 1 ;
            }

        }
        return start;
    }
}
