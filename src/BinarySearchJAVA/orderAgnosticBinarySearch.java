package BinarySearchJAVA;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int arr1 [] = {8,7,6,5,4,3,2,1};
        System.out.println(occuredAt(arr1, 7));
    }
    public static Boolean isAscending(int [] arr ){
        if (arr[0] > arr[arr.length-1]){
            return false;
        }
        return true;
    }

    public static int occuredAt(int arr[], int target){
        int start =0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = start + (end -start ) / 2 ;
            if (arr[mid] == target){
                return mid;
            }
            if (isAscending(arr)) {
                if (target > arr[mid] ){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }else {
                if (target > arr[mid] ){
                    end = mid-1;

                }else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
