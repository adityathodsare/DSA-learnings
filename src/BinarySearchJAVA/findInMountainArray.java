package BinarySearchJAVA;
interface MountainArray {
      public int get(int index);
      public int length() ;
  }
public class findInMountainArray {
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82} ;
        System.out.println(search(arr, 101));
    }
    public static int search (int arr[], int target){
        int peek = returnLargest(arr);
        int index = binarySearching(arr,target, 0, peek);
        if (index == -1){
            index = binarySearching(arr,target,arr.length-1,peek);
        }
        return index;
    }
    public static Boolean isAscending(int [] arr ){
        if (arr[0] > arr[arr.length-1]){
            return false;
        }
        return true;
    }

    public static int binarySearching (int arr [], int  target, int start, int end){

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
    public static int returnLargest(int arr[] ){
        int start =0;
        int end = arr.length-1;
        while (start< end){
            int mid = start + (end -start)/2;
            if (arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1 ;
            }
        }
        return  start;
    }
}
