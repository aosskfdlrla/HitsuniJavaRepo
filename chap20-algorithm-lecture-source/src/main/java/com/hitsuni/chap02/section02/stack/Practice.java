package com.hitsuni.chap02.section02.stack;

import java.util.Stack;

public class Practice {
    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < input.length(); i++) {
            if(input.charAt(i) == '('){
                stack.push('(');
            } else {
                // 꺼낼 수 없다면 여는 괄호가 부족해서 짝이 안 맞는 상황
                if(!stack.isEmpty())
                    stack.pop();
                else
                    return "NO";
            }
        }

        if(stack.isEmpty())
            return "YES";

        return "NO";
    }
}
