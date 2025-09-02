package searchingInJAva;

public class FindNumbersWithEvenNumbers1295 {
//    public int findNumbers(int[] nums) {
//        int counter =0;
//        for (int i =0 ; i< nums.length ; i++ ){
//            String var = Integer.toString(nums[i]);
//            if (var.length() % 2 ==0 ){
//               counter ++;
//            }
//        }
//        return counter;
//    }

    // optimized
    public int findNumbers(int[] nums) {
        int counter =0;
        for (int i =0 ; i< nums.length ; i++ ){
            if (NumberOfDigits(nums[i]) % 2 ==0){
                counter ++;
            }
        }
        return counter;
    }
    public int NumberOfDigits(int num ){
        return (int) (Math.log10(num)) +1;
    }
}
