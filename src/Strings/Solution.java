package Strings;

public class Solution {
    public static int compareVersion(String version1, String version2) {
        StringBuilder v1 = new StringBuilder("");
        StringBuilder v2 = new StringBuilder("");

        for (int i =0; i<version1.length(); i++){
            if (i>=1 && version1.charAt(i)=='.'){
                break;
            }
            v1.append(version1.charAt(i));
        }
        System.out.println(v1);
        char ch1 []= v1.toString().toCharArray();

        StringBuilder sb1 = new StringBuilder("");
        for (int i =1; i< ch1.length ; i++){
            if (ch1[i] == '.'){
                continue;
            }
            sb1.append(ch1[i]);
        }

        int num1 = Integer.parseInt(sb1.toString());
        System.out.println("num1" +num1);


        for (int i =0; i< version2.length(); i++){
            if (i>2 && version2.charAt(i)=='.'){
                break;
            }
            v2.append(version2.charAt(i));
        }
        System.out.println(v2);
        char ch2 []= v2.toString().toCharArray();

        for (int i =1; i< ch2.length ; i++){
            if (ch2[i] == '.'){
                continue;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1", "1.000005"));

    }
}
