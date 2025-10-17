package HackerRankChallenges;

public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigits(124));
    }
    public static int findDigits(int n) {
        int result = 0;
        char carr[] = String.valueOf(n).toCharArray();
        for (int i =0; i< carr.length; i++){
           int val = Integer.valueOf(carr[i]-'0');
            System.out.println(val);
           if (val!=0 && n%val== 0 ){
               result++;
           }
        }
        return result;
    }
}
