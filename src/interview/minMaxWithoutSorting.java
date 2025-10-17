package interview;

public class minMaxWithoutSorting {
    public static void main(String[] args) {
        int arr[] ={ 1, 2, 3,4,5,6};
        int max = Integer.MIN_VALUE;
        for (int i =0; i< arr.length; i++){
            if (max >= arr[i]){
                continue;
            }else {
                max = arr[i];
            }
        }
        System.out.println(max);

        // reverse a String
        String s ="aditya is good men";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());

        // reverse an array
        int i =0;
        while(i<arr.length/2){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
            i++;
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println( );

        // sum of elements of arr
        int sum = 0;
        for (int ele : arr){
            sum += ele;
        }
        System.out.println(sum);

        // fibonachi numbers

        int a =0;
        int b =1 ;
        int num = 10;
        for (int j =1; j<= num ; j++){
            System.out.print(a+" ");
            int next = a+b;
            a =b ;
            b = next;
        }


    }
}
