package Strings;

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
    public  static  List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for (int i =1 ; i<=n ; i++){
            if (i%3 != 0  || i% 5 != 0 ){

                list.add(String.valueOf(i));

            }
            if (i%3 == 0 ) {
                list.add("Fizz");
            }
            if (i% 5 == 0){
                list.add("Buzz");
            }
        }

        return list;

    }
}
