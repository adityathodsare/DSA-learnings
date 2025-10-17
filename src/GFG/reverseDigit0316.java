package GFG;

public class reverseDigit0316 {
    public int reverseDigits1(int n) {
        // Code here
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        return Integer.valueOf(sb.reverse().toString());
    }

    public int reverseDigits(int n) {
        // Code here
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+ digit;
            n = n/10;
        }
        return rev;
    }
}
