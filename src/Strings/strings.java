package Strings;

public class strings {

    public static void main(String[] args) {
        String [] strs ={ "flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs) );
    }
    public static String longestCommonPrefix(String[] strs) {


        String ref = strs[0];
        if (ref == null){
            return  "";
        }

        for (int i = 1 ; i<strs.length; i++ ){
            while (strs[i].indexOf(ref) != 0 ){

                ref = ref.substring(0, ref.length()-1);
                if (ref.isEmpty()){
                    return "";
                }

            }
        }

        return ref ;




    }
}
