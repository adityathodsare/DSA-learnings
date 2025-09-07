package Arrays;

import java.util.List;

public class countPairsWhoseSumIsLessThanTarget {
    public int countPairs(List<Integer> nums, int target) {
        int counter =0;
        for (int i =0; i<nums.size(); i++){
            for (int j=0; j<nums.size(); j++){
                if (i==j){
                    continue;
                }
                if (nums.get(i) + nums.get(j) < target){
                    counter++;
                }
            }
        }
        return counter;
    }
}
