package TP;

public class fill_the_bucket {
    public static int maxArea(int[] height) {
        int i =0;
        int j = height.length-1;
        int maxArea = 0;
        while(i<j){
            int currentArea = Math.min(height[i],height[j]*(j-i));
            maxArea = Math.max(currentArea,maxArea);
            if (height[i]>height[j]){
                j--;
            }else {
                i++;
            }
        }
        return maxArea;
    }
}
