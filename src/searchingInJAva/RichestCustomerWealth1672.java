package searchingInJAva;

import java.util.ArrayList;
import java.util.Arrays;

public class RichestCustomerWealth1672 {
//    public int maximumWealth(int[][] accounts) {
//
//        ArrayList arr = new ArrayList();
//        for (int i =0; i<accounts.length; i++){
//            int wealth =0;
//            for (int j = 0; j<accounts[i].length; j++){
//                wealth = wealth+accounts[i][j];
//            }
//            arr.add(wealth);
//        }
//        int [] wealthArr = new int[arr.size()];
//        for (int i =0; i<wealthArr.length ;i++){
//            wealthArr[i] = (int)arr.get(i);
//        }
//        Arrays.sort(wealthArr);
//        return wealthArr[wealthArr.length-1];
//    }

    public int maximumWealth(int[][] accounts) {

        int sum = Integer.MIN_VALUE;
        for (int i =0; i<accounts.length; i++){
            int wealth =0;
            for (int j = 0; j<accounts[i].length; j++){
                wealth = wealth+accounts[i][j];
            }
            if (wealth>sum){
                sum = wealth;
            }
        }
        return  sum;
    }
}
