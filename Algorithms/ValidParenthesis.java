package Algorithms;

import java.util.*;

public class ValidParenthesis {

    public static boolean validParenthesis(String str) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {

            if(str.charAt(i)=='(') {
                stack.push(')');
            }
            else if(str.charAt(i)=='{') {
                stack.push('}');
            }
            else if(str.charAt(i)=='[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        String str = s.next();

        boolean result = validParenthesis(str);

        System.out.println(result);
    }
}
