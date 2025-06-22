package Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,2} ;
        System.out.println( maxArea(height));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int m1, m2 , m3 ,m4 ;
        int  j = height.length - 1;
        if(height[i+1] > height[i]){
            m1 = height[i+1];
            m2 = i+1;
        }else {
            m1 = height[i];
            m2 = i;
        }

        if (height[j-1] > height[j] ){
            m3 = height[j-1];
           m4 = j-1 ;

        }else {
            m3 = height[j];
            m4 = j;
        }

        if (  height[i+1] == height[j-1]){
            m4 = j;
        }
        if (height[i] == height[j-1] ||  height[j] == height[i+1]){
            m2 = i ;
        }

        int result = 0 ;

        if (m1>m3){
            result = m3 * (m4 - m2 );
        }else {
            result = m1 * (m4 - m2 );
        }

         return result;


    }
}
