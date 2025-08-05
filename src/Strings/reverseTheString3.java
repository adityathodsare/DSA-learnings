package Strings;

public class reverseTheString3 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");

        String arr[] = s.split(" ");
        for(int i =arr.length-1; i>=0; i--){
            if (arr[i].length() == 0){
                continue;
            }

            if (sb.length() ==0){
                sb.append(arr[i]);
            }else {
                sb.append(" "+arr[i]);
            }


        }
        return sb.reverse().toString();
    }
}
