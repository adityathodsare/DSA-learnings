package slidingW;

public class rotateArr {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        rotates(arr,3);
    }
     public static void rotates(int[] arr, int k) {
        int size = arr.length;

//        k=k%size;

        rotete(arr, 0,size-1);
         System.out.println("step 1 ");
        for (int nums : arr){
            System.out.println(nums);
        }
         rotete(arr,0,k-1);
         System.out.println("step 2");
         for (int nums : arr){
             System.out.println(nums);
         }
         rotete(arr,k,size-1 );
         System.out.println("step 3");
         for (int nums : arr){
             System.out.println(nums);
         }

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
