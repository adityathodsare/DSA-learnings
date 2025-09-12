package Recursion;

public class BinarySearchInRecursion {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 1;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    public static int binarySearch(int arr[], int target, int s, int e ){
        if (s>e){
            return  -1;
        }
        int m = s + (e-s)/2;
        if (target == arr[m]){
            return m;
        }
        if (arr[m] < target){
            return binarySearch(arr,target,m+1, e);
        }
        return  binarySearch(arr,target,s,m-1);

    }
}
