package hashMap;

import java.util.HashMap;
import java.util.Map;

public class majority {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1 );
            // map madhi put ker :
                    // key: value of array element
                    // value : getOrObject(key, defaultValue) +1 ; increment sathi
        }
        n= n/2 ;
        for (Map.Entry<Integer,Integer> ele: map.entrySet()){
            if (ele.getValue() >= n){
                return ele.getKey();
            }
        }
        return 0;

    }
}
