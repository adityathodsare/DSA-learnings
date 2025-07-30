//package Arrays;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class mejorityElements {
//    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int occurs =0;
//        for (int i =0; i<nums.length-1; i++ ){
//            if (map.containsKey(nums[i])) {
//                map.replace(nums[i],occurs++ );
//            }else {
//                map.put(nums[i],occurs++ );
//            }
//        }
//
//        int[] arr = new int[map.size()];
//        int i =0;
//        for (int arr1 : map.values()){
//            arr[i++] = arr1;
//        }
//
//        Arrays.sort(arr);
//
//        return  map.entrySet()
//
//
//    }
//}
