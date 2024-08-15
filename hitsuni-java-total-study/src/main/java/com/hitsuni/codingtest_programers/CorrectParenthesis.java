package com.hitsuni.codingtest_programers;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String srr = scan.nextLine();
        System.out.println(solution(srr));
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (s.charAt(i) == ')')
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
