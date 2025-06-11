package Arrays;

import java.util.Arrays;

public class addZeroToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,8,2};
        int targetIndex = arr.length ;
        Arrays.sort(arr);

        for (int arr1 : arr){
            System.out.println(arr1);
        }

        for(int i =0 ; i<arr.length/2 ; i++){
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }


        System.out.println("0 last" );
        for (int arr1 : arr){
            System.out.println(arr1);
        }
    }
}
