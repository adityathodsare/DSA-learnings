package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StockSSpanProblemGFG {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int[] prevGreater = returnPrevGreater(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i =0; i<prevGreater.length; i++){
            ans.add(i-prevGreater[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        display(returnPrevGreater(new int[]{10,4,5,90,120,80}));
        System.out.println(0-(-1));
    }

    public static  int[] returnPrevGreater(int[] arr){
        int [] ans = new int[arr.length];
        ans[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i=1; i< arr.length; i++){
            while(!st.isEmpty()){
                if (arr[i] > arr[st.peek()]){
                    st.pop();
                }else {

                    ans[i] = st.peek();
                    st.push(i);
                    break;
                }
            }
            if (st.isEmpty()){
                ans[i] = -1;
                st.push(i);
            }
        }
        return ans;
    }

    public static  void display(int arr[]){
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
