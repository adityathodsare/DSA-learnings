package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class BalancingBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())())"));
    }
    public static boolean isBalanced(String s) {
        Stack<Character>  st = new Stack<>();
        for (int i =0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == ')'){
                if (st.isEmpty()){
                    return  false;
                }else {
                    st.pop();
                }
            }
        }
        return true;
    }
}
