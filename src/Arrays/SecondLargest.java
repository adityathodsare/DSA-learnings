package Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {7,65,4,3,245,23};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

//        String a = "hello";
//        String b = "he"+"llo";
//        String c = "hell";
//        String d = c+"o";
//
//        System.out.println(a.equals(d));
    }
}
