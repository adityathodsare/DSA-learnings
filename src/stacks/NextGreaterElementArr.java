package stacks;

import java.util.Stack;

public class NextGreaterElementArr {
    public static void main(String[] args) {
        int arr [] = {1,3,2,1,8,6,3,4};
        printArr(nextGreaterArray(arr));
        System.out.println();
        System.out.println();
        printArr(nextGreaterArrayByStack(arr));
    }
    public static int[] nextGreaterArrayByStack(int arr[]){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        st.push(arr[arr.length-1]);
        ans[ans.length-1] = -1;

        for (int i = arr.length-2; i>=0; i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                ans[i] = -1;
                st.push(arr[i]);
            }else {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return ans;

    }

    public static int[] nextGreaterArray(int arr[]){
       int [] ans = new int[arr.length];
       for (int i =0; i< arr.length ; i++){
           for (int j =i+1; j< arr.length; j++){
               if (arr[j] > arr[i]){
                   ans[i] = arr[j];
                   break;
               }else {
                   continue;
               }
           }
           if (ans[i] == 0){
               ans[i] = -1;
           }
       }
       return  ans;
    }

    public static void printArr(int[] arr){
        for (int a : arr){
            System.out.println(a);
        }
    }
}
