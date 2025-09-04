package BinarySearchJAVA;

public class FindSmallestNumberGreaterThanTarget744 {
    public static void main(String[] args) {
        System.out.println(0%3);
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target < letters[mid]){
                end = mid -1 ;
            }else {
                start = mid +1;
            }
        }
        return letters[start % letters.length];
    }
        public char nextGreatestLetter1(char[] letters, char target) {
            for (char ch : letters){
                if (target > ch){
                    return ch;
                }
            }
            return letters[0];
        }
}
