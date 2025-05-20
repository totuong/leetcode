package Test151;

import java.util.Stack;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                stack.push(s.charAt(i));
            } else if (!stack.empty()) {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
        }
        while (!stack.empty()) {
            sb.append(stack.pop());
        }

        return sb.toString().trim();
    }
}
