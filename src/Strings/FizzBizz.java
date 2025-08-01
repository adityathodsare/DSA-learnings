package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBizz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(Integer i =1; i<=n ; i++){
            if (i%3 ==0 ){
                list.add("Fizz");
                continue;
            }
            if (i%5 == 0){
                list.add("Buzz");
                continue;
            }
            if (i%15 == 0){
                list.add("FizzBuzz");
                continue;
            }
            list.add(i.toString());

        }
        return  list;
    }
}
