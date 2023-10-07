package main.java;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

//    public static void main(String[] args) {
//        System.out.println(new ValidParentheses().isValid("[]"));
//        System.out.println(new ValidParentheses().isValid("[(])"));
//        System.out.println(new ValidParentheses().isValid("{[]()}"));
//        System.out.println(new ValidParentheses().isValid("("));
//        System.out.println(new ValidParentheses().isValid("(("));
//        System.out.println(new ValidParentheses().isValid("}("));
//    }


    //O(n)
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char i : s.toCharArray()) {
            if (i == '[' || i == '(' || i == '{') {
                stack.push(i);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char bracket = stack.pop();

                switch (bracket) {
                    case '[' -> {
                        if (i != ']') {
                            return false;
                        }
                    }
                    case '{' -> {
                        if (i != '}') {
                            return false;
                        }
                    }
                    case '(' -> {
                        if (i != ')') {
                            return false;
                        }
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
