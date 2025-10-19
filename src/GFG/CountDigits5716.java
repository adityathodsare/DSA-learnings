package GFG;

public class CountDigits5716 {
    public static void main(String[] args) {
        System.out.println(evenlyDivides(43));
    }
    static int evenlyDivides(int n) {
        // code here
        int duplicate = n;
        int counter =0;
        while(duplicate>0){
            int digit = duplicate % 10; // n = 56 -->> 50+ r = 6

            if (digit == 0){
                duplicate=duplicate/10;
                continue;
            }
            if(n%digit == 0){
                counter++;
            }
            duplicate=duplicate/10;

        }
        return counter;

    }
}
