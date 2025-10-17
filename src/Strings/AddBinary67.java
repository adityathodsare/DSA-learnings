//package Strings;
//
//public class AddBinary67 {
//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        int largestSize = 0;
//        if (a.length()< b.length()){
//            largestSize = b.length();
//        }else {
//            largestSize = a.length();
//        }
//        int iterator =0;
//        while(iterator <= largestSize){
//            if (iterator>= b.length()){
//                sb.append(a.charAt(iterator));
//                iterator++; continue;
//            }
//            if (iterator>= a.length()){
//                sb.append(b.charAt(iterator));
//                iterator++; continue;
//            }
//            if (a.charAt(iterator) == '1' )
//            iterator++;
//        }
//
//
//    }
//}
