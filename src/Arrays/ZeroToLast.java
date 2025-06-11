package Arrays;

public class ZeroToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,8,0,7,0,6};
        int index = 0 ;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }

        }
        while (index<arr.length){
            arr[index] = 0;
            index++;
        }

        for (int arr1 : arr){
            System.out.println(arr1);
        }
    }
}
