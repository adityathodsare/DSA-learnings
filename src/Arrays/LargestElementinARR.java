package Arrays;

public class LargestElementinARR {
    public static void main(String[] args) {
        int[] arr = {2,45,65,65,44};
        // find largest element in array

        int largest_ele = arr[0];
        for (int i =0 ;i<arr.length; i++){
           if (largest_ele <= arr[i]){
               largest_ele = arr[i];

           }
        }
        System.out.println(largest_ele);
    }
}
