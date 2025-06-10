package Arrays;

import java.util.Arrays;

public class isArraySorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6};
             for (int i =0; i<arr.length-1; i++ ){
                 if (arr[i]>=arr[i+1] ){
                     System.out.println("array is not soted");
                     return;
                 }
             }
        System.out.println("array is sorted");
    }
}
