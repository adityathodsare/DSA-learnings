package GFG;

import java.util.*;

public class SecondLargest3735 {
    public static void main(String[] args) {
        int arr [] = {10, 5, 10};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest1(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int j =0;
        for (int i =0; i< arr.length; i++){
            if (map.isEmpty()){
                map.put(j++,arr[i]);
            }
            if(map.containsValue(arr[i])){
                continue;
            }
            map.put(j++,arr[i]);
        }
        int ans [] = new int[map.size()];
        System.out.println(map);
        System.out.println(map.size());
        for (int i =0; i<map.size() ; i++){
            System.out.println(i);
            ans[i] = map.get(i);
        }

        Arrays.sort(ans);
        if (ans.length==1 || ans.length==0){
            return -1;
        }
        System.out.println(Arrays.toString(ans));
        return  ans[ans.length-2];

    }

    public static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        for (int i =arr.length-1; i>=0; i--){
            if (arr[i] != max){
                return arr[i];
            }
        }
        return  -1;
    }
}
