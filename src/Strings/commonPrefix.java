package Strings;

public class commonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // if empty return " "
        if (strs[0] == null || strs[0] == " " || strs[0].isEmpty()){
            return  " ";
        }
        // take a reference of first
        String reference = strs[0];

        for (int i = 1; i<strs.length; i++){
            while(!strs[i].startsWith(reference)){
                if (reference == strs[i]){
                    return reference;
                }else {
                    reference = reference.substring(0,reference.length()-1);
                }
            }
        }
        return  reference;
    }

    public static void main(String[] args) {
        String str1[] = {"adityasourace","aditya","adinath"};
        String str2 = "aditya";
        String str3 = "adi";
        System.out.println(str3.startsWith(str2));


        System.out.println(longestCommonPrefix(str1));
    }
}
