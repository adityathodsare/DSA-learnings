package Strings;

import java.util.Collections;
import java.util.List;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        // Sort dictionary by length so shortest root is matched first
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());

        String[] arr = sentence.split(" ");
        for (int j = 0; j < arr.length; j++) {
            for (String root : dictionary) {
                if (arr[j].startsWith(root)) {
                    arr[j] = root; // replace with shortest root
                    break; // stop checking further roots for this word
                }
            }
        }
        return String.join(" ", arr);
    }
}
