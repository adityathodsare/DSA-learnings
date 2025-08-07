package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int largest = getLargestEleFromArr(score);
        int map[] = new int[largest+1];
        int n = score.length;
        for (int i = 0; i<n ; i++){
            map[score[i]] = i+1;
        }
        String ans[]= new String[score.length];
        int rank =0;
        System.out.println(map.length);
        for (int i = map.length-1; i>=0; i--){
            if (map[i] != 0){
                rank++;
                int orgIndex = map[i]-1;
                if (rank == 1){
                    ans[orgIndex] = "Gold Medal";
                } else if (rank == 2) {
                    ans[orgIndex] = "Silver Medal";
                }else if (rank == 3) {
                    ans[orgIndex] = "Bronze Medal";
                }else{
                    ans[orgIndex] = String.valueOf(rank);
                }
            }
        }
        return ans;
    }

    public static int getLargestEleFromArr(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int a : arr){
            largest = Math.max(largest,a);
        }
        System.out.println(largest);
        return largest;
    }

    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        System.out.println(findRelativeRanks(arr));

    }
}
