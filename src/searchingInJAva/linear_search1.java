package searchingInJAva;

public class linear_search1 {
    public static void main(String[] args) {
        int arr[]= {20,20,10, 2, 3 ,45, 65 ,0, 1};
        int arr2d[][] = {
                {1,3,34},
                {1,3,32},

        };
//        System.out.println("ele found at index : "+findIndex(arr,10));
//        System.out.println(findCharIndex("aditya", 'a'));
//        System.out.println("minimum number is : "+ findMinNumber(arr));
//        System.out.println("maximum number is : "+ findMaxNumber(arr));
        findIndexIn2DArray(arr2d,34);
    }

    // function for searching an element in an array if present then return index
    // else return -1
    public static int findIndex(int[] arr, int target ) {
        int index = -1 ;
        for (int i =0; i<arr.length; i++){
            if (arr[i] == target){
                index = i;
            }
        }
        return index;
    }

    // search in string return index of charecter
    public static int findCharIndex(String str , char target ){
        char[] charArr = str.toCharArray();
        for (int i =0 ; i<charArr.length;i++ ){
            if (charArr[i] == target){
                return  i;
            }
        }
        return  -1;
    }

    // searching minimum number in array
    public static int findMinNumber(int [] arr){
        int minNumber = Integer.MAX_VALUE;
        for (int num : arr){
            if (num < minNumber){
                minNumber = num;
            }
        }
        return  minNumber;
    }

    // searching minimum number in array
    public static int findMaxNumber(int [] arr){
        int maxNumber = Integer.MIN_VALUE;
        for (int num : arr){
            if (num > maxNumber){
                maxNumber = num;
            }
        }
        return  maxNumber;
    }

    // linear search in 2D array
    // search for 34 element in 3d array return its index
    public static void findIndexIn2DArray(int[][] arr , int target ){
        for (int i =0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if (target == arr[i][j] ){
                    System.out.println("row :"+i+ " "+ "column; "+j);
                }
            }
        }
    }


}
