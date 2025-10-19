package GFG;

import java.util.*;

public class SecondLargest3735 {
    public static void main(String[] args) {
        int arr [] = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for (int i =0; i< arr.length; i++){
            if (map.isEmpty()){
                map.put(i,arr[i]);
            }
            if(map.containsValue(arr[i])){
                continue;
            }
            map.put(i,arr[i]);
        }
        int ans [] = new int[map.size()];
        System.out.println(map);
        for (int i =0; i<map.size() ; i++){
            ans[i] = (int)map.get(i);
        }

        Arrays.sort(ans);
        if (arr.length==1 || arr.length==0){
            return -1;
        }
        System.out.println(Arrays.toString(ans));
        return  ans[ans.length-2];

    }
}
