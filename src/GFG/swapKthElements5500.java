package GFG;

import java.util.ArrayList;
import java.util.List;

public class swapKthElements5500 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0,1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        System.out.println(arr);
        swapKth(arr,3);

    }
    public static void swapKth(List<Integer> arr, int k) {
        // code here

        int kth = arr.get(k-1);
        System.out.println(kth);
        arr.remove(k-1);
        arr.add(k-1,arr.get(arr.size()-k+1));
        arr.remove(arr.size()-k+1);
        arr.add(arr.size()-k+1, kth);
        System.out.println(arr);
    }
}
