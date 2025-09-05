package Arrays;

import java.util.ArrayList;

public class shiftzero {
    public void moveZeroes(int[] nums) {
        ArrayList list = new ArrayList();
        for(int i =0; i<nums.length; i++){
            if (nums[i] ==0){
                continue;
            }else{
                list.add(nums[i]);
            }
        }


        for (int i=0; i<list.size(); i++){
            nums[i] = (int)list.get(i);
        }
        for (int i =list.size(); i<nums.length; i++){
            nums[i] =0;
        }
    }
}
