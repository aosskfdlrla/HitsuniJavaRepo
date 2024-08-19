package com.hitsuni.codingtest_backjoon;

import java.io.*;
import java.util.Stack;

public class CodingTest_9012 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++)
                bw.write(solution(br.readLine()) + "\n");

            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < input.length(); i++) {
            if(input.charAt(i) == '('){
                stack.push('(');
            } else {
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
