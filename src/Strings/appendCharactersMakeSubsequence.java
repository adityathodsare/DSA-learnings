package Strings;

import java.util.ArrayList;
import java.util.List;

public class appendCharactersMakeSubsequence {
    public static int appendCharacters(String s, String t) {
        List<Character> list = new ArrayList<>();
        for (char ch : t.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);

        char arr [] = s.toCharArray();
        for (int i =0; i<list.size(); i++){
            for (int j =0; j<list.size(); j++){
                if (list.get(j) !=  arr[i]){
                    System.out.println("breaked");
                    break;
                }
                if (list.get(j) ==  arr[i]){
                    list.remove(j);
                }

                System.out.println("continued");
            }
        }
        System.out.println(list);
        return  list.size();
    }

    public static void main(String[] args) {
        System.out.println(appendCharacters("lbg", "g"));
    }
}
