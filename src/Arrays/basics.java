package Arrays;

public class basics {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // garbage value
        arr[0]=1;
        int [] arr1 = {1,2,3,4,5,66,7};
        System.out.println(arr1);
        System.out.println(arr);

        // for each loop
        for (int e : arr1){
            System.out.println(e);
        }
        // actual values 0 if not declared

        System.out.println(arr[2]);

        System.out.println(arr1.length);
        System.out.println("mannually ");
        for (int i =0 ; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
