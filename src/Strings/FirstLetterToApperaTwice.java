package Strings;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToApperaTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            if (set.contains(c)){
                return c;
            }else{
                set.add(c);
            }
        }
        return ' ';
    }
}
