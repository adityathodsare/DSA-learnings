package Strings;

import java.util.ArrayList;
import java.util.List;

public class sentenceSimilarityIII1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String s1[] = sentence1.split(" ");
        String s2[] = sentence2.split(" ");

        List<String> sc1 = new ArrayList<>();
        for (String s : s1){
            sc1.add(s);sentence1.length() < sentence2
        }

        if ()

        if (s2[0].equals(sc1.get(0) )){



            if (s2[0].equals(sc1.get(0)) && s2.length == 1){
                return true;
            }
            for (int i =1; i<s2.length; i++){
                if (sc1.contains(s1[i])){
                    return true;
                }
            }
            return false;
        }
        return  false;
    }

}
