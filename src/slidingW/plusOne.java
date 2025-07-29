package slidingW;

import java.util.ArrayList;
import java.util.List;

public class plusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        for (int results : digits){
            result.add(results);
        }
        if (digits[digits.length-1]==9 && digits[digits.length-1]==9){
            result.remove(digits.length-2);
            result.remove(digits.length-1);
            result.add(digits.length-2,1);
            result.add(digits.length-1,0);
            result.add(digits.length,0);
            return convertToArray(result);
        }

        if (digits[digits.length-1]==9){
            result.remove(digits.length-1);
            result.add(digits.length-1,1);
            result.add(digits.length,0);
            return convertToArray(result);
        }else {
            result.remove(digits.length-1);
            result.add(digits.length-1,digits[digits.length-1]+1);
            return convertToArray(result);
        }
    }

    public int[] convertToArray (List<Integer> list ){
        int arr [] = new int[list.size()];
        int index = 0 ;
        for (int n : list){
            arr[index++] = n;
        }
        return  arr;
    }
}
