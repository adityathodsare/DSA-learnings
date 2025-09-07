package Arrays;

import java.util.ArrayList;

public class DivisibleAndNonDivisibleSumsDifference2894 {
    public int Approach1(int n, int m) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();

        for (int i =1; i<=n; i++){
            if (i%m != 0){
                num1.add(i);
            }else {
                num2.add(i);
            }
        }
        int numOne =0;
        for (int i =0; i<num1.size(); i++){
            numOne += num1.get(i);
        }

        int numTwo =0;
        for (int i =0; i<num2.size(); i++){
            numTwo += num2.get(i);
        }

        return  numOne-numTwo;
    }

    public int differenceOfSums(int n, int m) {
        int num1 =0;
        int num2 = 0;
        for (int i =1; i<=n; i++){
            if (i%m != 0){
                num1 += i;
            }else {
                num2 += i;
            }
        }
        return  num1 - num2;
    }
}
