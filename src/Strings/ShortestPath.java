package Strings;

public class ShortestPath {
    public static double shortestPath(String str ){
        int shortestPath=0;
        int x=0;
        int y=0;
//        int E = x+1;
//        int W = x-1;
//        int N = y+1;
//       ' int S = y-1;'
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'E'){
                x += 1;
            }
            if (str.charAt(i) == 'W'){
                x -= 1;
            }
            if (str.charAt(i) == 'N'){
                y += 1;
            }
            if (str.charAt(i) == 'S'){
                y -= 1;
            }
        }
        System.out.println(x);
        System.out.println(y);
        return Math.sqrt((x*x)+(y*y));

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
