package stacks;

public class NextGreaterElementArr {
    public static void main(String[] args) {
        int arr [] = {1,3,2,1,8,6,3,4};
        printArr(nextGreaterArray(arr));
    }
    public static int[] nextGreaterArray(int arr[]){
        int ans[] = new int[arr.length];
        int index = 0;
        for (int i =0; i< arr.length; i++){
            for (int j =i; j< arr.length; j++ ){
                if (arr[i] <arr[j]){
                    if (index < ans.length) {
                        ans[index] = arr[j];
                        index++;
                    }
                }
            }
        }
        return ans;
    }

    public static void printArr(int[] arr){
        for (int a : arr){
            System.out.println(a);
        }
    }
}
