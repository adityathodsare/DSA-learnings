package Arrays;

public class countOfGreaterThanPriorElements {
    // Arr[]={7,4,8,2,9}
    //Hence the output = 3

    public static void main(String[] args) {
        int arr [] = {7,4,8,2,9};
        System.out.println(countOfGreaterElement(arr));
    }
    public static int countOfGreaterElement(int arr[]){
        if (arr.length == 0) return 0;

        int count = 1; // first element always counted

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
            }
        }
        return count;
    }


}
