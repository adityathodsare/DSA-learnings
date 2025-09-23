package stacks;

import java.util.Stack;

public class LargestAreaInHistogram84 {

    public static void main(String[] args) {
        printArr(nextSmallerArr(new int[] {2,1,5,6,2,3}));
        printArr(prevSmallest(new int[] {2,1,5,6,2,3}));
        System.out.println(largestRectangleArea(new int[] {2,1,5,6,2,3}));



    }

    public static  int largestRectangleArea(int[] heights) {
        int PSE[] = prevSmallest(heights);
        int NSE[] = nextSmallerArr(heights);
        int ref = Integer.MIN_VALUE;
        for (int i =0; i<heights.length; i++){
           int area = heights[i] * (NSE[i] - PSE[i] - 1);
           ref = Math.max(ref,area);

        }
        return  ref;
    }
    public static int[] nextSmallerArr(int[] arr){
        Stack<Integer> st = new Stack<>();
        int NSE [] = new int[arr.length];
        st.push(arr.length-1);
        NSE[arr.length-1]= arr.length;
        for (int i = arr.length-2; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                NSE[i] = arr.length;
                st.push(i);
            }else {
                NSE[i] = st.peek();
                st.push(i);
            }
        }
        return  NSE;
    }

    public static int[] prevSmallest(int [] arr){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] PSE = new int[arr.length];
        PSE[0]= -1;
        for (int i =1; i< arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i] ){
                st.pop();
            }

            if (st.isEmpty()){
                PSE[i] =-1;
                st.push(i);
            }else {
                PSE[i] = st.peek();
                st.push(i);
            }
        }
        return PSE;
    }

    public static void printArr(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");

        }
        System.out.println();
    }
}
