package GFG;

public class ArmStrongNumber2727 {
    static boolean armstrongNumber(int n) {
        // code here
        char carr[] = String.valueOf(n).toCharArray();
        int result = 0;
        
        for(int i =0; i<carr.length; i++){

            int number = carr[i] - '0';
            result += number*number*number;
        }
        if(result == n){
            return true;
        }
        return false;
    }
}
