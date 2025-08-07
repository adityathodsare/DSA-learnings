package Strings;

public class ScoreofString {
    public static int scoreOfString(String s) {
        int score =0;
        int [] arr = new int[s.length()];
        int i =0;
        for (char ch : s.toCharArray()){
            arr[i++] = Integer.valueOf(ch);
        }
        for (int j =0 ; j<arr.length-1; j++){
            score = score + Math.abs(arr[j]-arr[j+1]);
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        char s = 'a';
        System.out.println( Integer.valueOf(s));
    }
}
