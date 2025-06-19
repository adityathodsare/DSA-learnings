package Arrays;

import java.util.Arrays;

public class roteteTheArray {

    public static void main(String[] args) {
        int arr[]={-1,-100,3,99};
        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k){

        int size = arr.length;
        rotete(arr, 0,size-1);
        rotete(arr,0,k-1);
        rotete(arr,k,size-1 );

    }



    public static void rotete (int arr[], int startindex, int upto){

        while(startindex <= upto){

            int temp = arr[startindex];
            arr[startindex]= arr[upto];
            arr[upto]= temp;
            startindex++;
            upto--;

        }


    }
}
