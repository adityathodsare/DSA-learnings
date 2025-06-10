package Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6};

        for (int i =0 ; i < arr.length/2; i++ ){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-(1+i)] = temp;
        }
        for (int ele : arr ){
            System.out.println(ele);
        }

    }
}
