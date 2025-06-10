package Arrays;

public class CountOccuranceOfAnyNumber {
    public static void main(String[] args) {
        // find 34 how much times present
        int[] arr = {34,45,56,34,34,23,34};

        int count = 0 ;
        for (int i=0 ; i<arr.length; i++ ){
            if (arr[i]== 34){
                count++;
            }
        }
        System.out.println(" 34 repeats "+ count+" times");
    }
}
