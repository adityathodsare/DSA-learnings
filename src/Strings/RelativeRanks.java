package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        int largest = getLargestEleFromArr(score);
        int newArr[] = new int[largest];
        for (int i =newArr[newArr.length-1]; i>=0; i--){

        }
    }

    public static int getLargestEleFromArr(int[] arr){
        int largest = Integer.MIN_VALUE;
        for (int a : arr){
            largest = Math.max(largest,a);
        }
        return largest;
    }
}
