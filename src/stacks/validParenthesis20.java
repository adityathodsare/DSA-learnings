package stacks;

import java.util.Stack;

public class validParenthesis20 {
    public static void main(String[] args) {
        System.out.println(isValid("}{"));
    }
    public static boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['  ){
                st.push(s.charAt(i));
                System.out.println(st);
                continue;
            }

            if (s.charAt(i) == ')' ){
                if (st.isEmpty()){
                    return  false;
                }
                if (st.peek() == '('){
                    st.pop();
                    System.out.println(st);
                    continue;
                }else{
                    return  false;
                }
            }

            if (s.charAt(i) == '}' ){
                if (st.isEmpty()){
                    return  false;
                }
                if (st.peek() == '{'){
                    st.pop();
                    System.out.println(st);
                    continue;
                }else{
                    return  false;
                }
            }

            if (s.charAt(i) == ']' ){
                if (st.isEmpty()){
                    return  false;
                }
                if (st.peek() == '['){
                    st.pop();
                    System.out.println(st);
                    continue;
                }else{
                    return  false;
                }
            }



        }
        System.out.println(st);
        return st.isEmpty();
    }
}
