package Arrays;

import java.util.Arrays;

public class large {
    public static void main(String[] args) {
        int[] arr = {100,2,34,56,56};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        String str = "abcdef";
        System.out.println(str.length());

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println("original :" + str);
        String reversed = sb1.reverse().toString();
        System.out.println("reversed: "+ reversed);

    }
}
