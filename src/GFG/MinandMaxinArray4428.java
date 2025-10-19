package GFG;

import java.util.ArrayList;
import java.util.List;

public class MinandMaxinArray4428 {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i =0; i< arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;

    }
}
