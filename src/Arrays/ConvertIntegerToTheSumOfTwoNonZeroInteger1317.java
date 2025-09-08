package Arrays;

public class ConvertIntegerToTheSumOfTwoNonZeroInteger1317 {
    public int[] getNoZeroIntegers(int n) {
        int arr [] = new int[2];
        if (isEven(n)){
            arr[0] = n/2;
            arr[1] = n/2;
        }else{
            arr[0] = n/2;
            arr[1] = n/2 +1;
        }
        return arr;
    }
    public Boolean isEven(int n){
        if (n%2 ==0){
            return true;
        }
        return false;
    }
}
