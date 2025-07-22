package slidingW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class insertionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        intersection(num1, num2 );
    }
    public static  int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int num1 : nums1){
            list.add(num1);

        }
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        for (int num2 : nums2){
            if ( list.contains(num2)){
                list2.add(num2);
            }
        }
        System.out.println(list2);

        int[] result = new int[list2.size()];
        for (int i =0; i<list2.size(); i++){
            result[i] = list2.get(i);
        }

        return result;



    }
}
