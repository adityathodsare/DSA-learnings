package hummingbirdRivision;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParanthesis {
    public static void main(String[] args) {

        System.out.println(isValid("(]"));

    }

    // brute  force
    public static boolean isValidq(String s) {
        //  creating a Hashmap
        Map<Character, Integer> map = new HashMap<>();
        map.put('[', 1);
        map.put(']', -1);
        map.put('{' , 2);
        map.put('}' , -2);
        map.put('(' , 3);
        map.put(')' , -3);

        int counterEle = 0;
        String sarr = s;
        for (int i = 0; i < sarr.length(); i++) {
            counterEle = counterEle + map.get(sarr.charAt(i));
        }
        if (counterEle == 0){
            return  true;
        }
        return false;
    }

     // fucked up ...

    public static boolean isValid(String s) {
        //  creating a Hashmap
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault( s.charAt(i) , 0)+1);
        }
        if (map.containsKey('{') || map.containsKey('}')){
            if (map.get('{') != map.get('}')){
                return  false;
            }
        }
        if (map.containsKey('[') || map.containsKey(']')){
            if (map.get('[') != map.get(']')){
                return  false;
            }
        }

        if (map.containsKey('(') || map.containsKey(')') ){
            if (map.get('(') != map.get(')')){
                return  false;
            }
        }

        return  true;
    }

    // right


        public static boolean isValid3(String s) {
            if(s.length()%2 != 0){
                return false;
            }
            Stack<Character> st = new Stack<>();
            for (int i =0; i<s.length(); i++){
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['  ){
                    st.push(s.charAt(i));
                    continue;
                }

                if (s.charAt(i) == ')' ){
                    if (st.isEmpty()){
                        return  false;
                    }
                    if (st.peek() == '('){
                        st.pop();
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
                        continue;
                    }else{
                        return  false;
                    }
                }



            }
            return st.isEmpty();
        }




}
