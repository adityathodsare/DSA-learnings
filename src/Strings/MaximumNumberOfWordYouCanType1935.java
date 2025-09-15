package Strings;

import java.util.ArrayList;

public class MaximumNumberOfWordYouCanType1935 {
    public int canBeTypedWords(String text, String brokenLetters) {
        text.replaceAll("\\p{Punct}","");
        String arr[] = text.split(" ");
        int size = arr.length;
        if (brokenLetters.isEmpty()){
            return size;
        }
        String broken[] = brokenLetters.split("");

        for (int i =0; i< arr.length; i++){
            for (int j =0; j< broken.length; j++){
                if (arr[i].contains(broken[j])){
                    size--;
                    break;
                }
            }
        }
        return  size;
    }
}
