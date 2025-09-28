package Strings;

import java.util.ArrayList;

public class GetEqualSubStringWithMaxCost {
    public int equalSubstring(String s, String t, int maxCost) {
        StringBuilder sb = new StringBuilder();
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int diffArr[] = new int[tarr.length];

        for (int i =0; i<tarr.length; i++){
            diffArr[i]= getAbsoluteDiff(sarr[i] ,tarr[i]);
        }
        ArrayList<Integer> list= new ArrayList<>();
        for (int i: diffArr){
            if (maxCost >= i){
                maxCost-=i;
                list.add(i);
            }
        }
        return list.size();

    }

    public int getAbsoluteDiff(char a , char b){
        return Math.abs(getAscii(a) - getAscii(b));
    }
    public int getAscii(char c ){
        return c-'a';
    }
}
