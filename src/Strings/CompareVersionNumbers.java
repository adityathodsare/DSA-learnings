package Strings;
//
//version1 = "1.2", version2 = "1.10"
//
//Output: -1

public class CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
//        for (String i : v1){
//            System.out.print(i+" ");
//        }
//        System.out.println(" ");
//        for (String i : v2){
//            System.out.print(i+" ");
//        }

        int maxLwngth ;
        if (v1.length>= v2.length){
            maxLwngth = v1.length;
        }else {
            maxLwngth = v2.length;
        }

        int arr1[] = new int[maxLwngth];
        int arr2 [] = new int[maxLwngth];
        int index=0;
        for (String s : v1){
            arr1[index++] = Integer.parseInt(s);
        }

        int ind=0;
        for (String s : v2){
            arr2[ind++] = Integer.parseInt(s);
        }


        for (int i =0; i<maxLwngth; i++){
            if (arr1[i] == arr2[i]){
                continue;
            }
            if (arr1[i] > arr2[i]){
                return 1;
            }
            if (arr1[i] < arr2[i]){
                return  -1;
            }
        }



        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.2.3.4.5", "1.2.3.4.5.6.7"));
    }
}
