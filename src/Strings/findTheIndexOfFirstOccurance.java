package Strings;

public class findTheIndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        char first = needle.charAt(0);
        if (! haystack.contains(needle)){
            return  -1;
        }else {
            for (int i =0; i<haystack.length(); i++){
                if (first == haystack.charAt(i)){
                    if (needle.equals(haystack.substring(i,i+needle.length()))){
                        return i;
                    }else {
                        continue;
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String s= "adi";
        String str = "adi";
        System.out.println(s.startsWith(str));
    }
}
