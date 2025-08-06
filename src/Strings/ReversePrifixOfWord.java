package Strings;

public class ReversePrifixOfWord {
    public static String reversePrefix(String word, char ch) {
        int start = 0;
        int end = getfirstIndex(word, ch);
        StringBuilder sb = new StringBuilder(word.substring(start,end+1));
        StringBuilder ans = new StringBuilder("");
        ans.append(sb.reverse().toString());
        ans.append(word.substring(end+1,word.length()));
        return ans.toString();

    }
    public static  int getfirstIndex(String word, char ch){
        char arr []= word.toCharArray();
        for(int i =0; i<arr.length; i++){
            if (arr[i]-ch == 0){
                return  i;
            }
        }
        return  0;
    }
}
