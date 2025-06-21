package Strings;

public class SerchingInString {

    public static void main(String[] args) {
        System.out.println(SerchinString("aditya",'a'));
        System.out.println(SerchinString1("adityaa",'m'));
    }

    public static boolean SerchinString(String line , char target){
        for (int i= 0 ; i< line.length() ; i++ ){
            if (target == line.charAt(i)){
                return true;
            }
        }
        return false;
    }


    public static boolean SerchinString1(String line , char target){
        for (char ch : line.toCharArray()){
            if (target == ch ){
                return  true ;
            }
        }
        return false;
    }
}
