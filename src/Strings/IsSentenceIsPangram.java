package Strings;

import java.util.HashSet;
import java.util.Set;

public class IsSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for(char i: sentence.toCharArray()){
            set.add(i);
        }
        if(set.size()== 26){
            return true;
        }
        return false;

    }
}
