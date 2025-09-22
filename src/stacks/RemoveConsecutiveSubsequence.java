package stacks;

import java.util.Stack;

public class RemoveConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = {1, 2,2, 3,3,3, 4, 5, 6,6,6, 7};
        printArr(removeConsecutive(arr));
    }
    public static int[] removeConsecutive(int arr[]){
        // 1, 2,2, 3,3,3, 4, 5, 6,6,6, 7
        // op - 1, 4, 5 ,7
        Stack<Integer> st = new Stack<>();
        int memory = -1;
        for (int i =0; i< arr.length ; i++){
            if (memory == arr[i]) {
                continue;
            }
            if (st.isEmpty() || st.peek()!= arr[i] ){
                st.push(arr[i]);
            } else {
                memory = st.pop();
                continue;
            }

        }
        Stack<Integer> st2 = new Stack<>();
        int stL = st.size();
        for (int i =0; i<stL; i++){
            st2.push(st.pop());
        }
        int  ans[] = new int[st2.size()];
        int index =0;
        while(index < ans.length){
            ans[index] = st2.pop();
            index++;
        }
        return ans;
    }

    public static void printArr(int[] arr){
        for (int a : arr){
            System.out.println(a);
        }
    }
}
