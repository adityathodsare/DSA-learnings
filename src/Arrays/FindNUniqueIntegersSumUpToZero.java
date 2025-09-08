package Arrays;

public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
    }

    public int getDifference(int n){
        int difference = n/2;
        return difference;
    }

    public int[] sumZero(int n) {
        int arr [] = new int[n];

        if (n==1){
            arr[0] =0;
            return arr;
        }
        if(n%2 !=0){
            int diff =-1 * getDifference(n);
            for (int i =0; i<n; i++){
                arr[i] = diff;
                diff++;
            }
        }else {
            int diff =-1 * getDifference(n);
            for (int i =0; i<n; i++){
                if (diff == 0){
                    diff++;
                }
                arr[i] = diff;
                diff++;
            }
        }
        return  arr;
    }
}
