package Arrays;

import java.util.ArrayList;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        ArrayList list = new ArrayList();
        for (int i =0; i<nums.length; i++){
            if (nums[i] == val){
                continue;
            }else {
                list.add(nums[i]);
            }
        }
        for (int i =0; i<list.size(); i++){
            nums[i] = (int) list.get(i);
        }
        return list.size();
    }
}
