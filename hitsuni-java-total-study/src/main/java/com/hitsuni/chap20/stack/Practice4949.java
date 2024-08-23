package com.hitsuni.chap20.stack;

import java.io.*;
import java.util.Stack;

public class Practice4949 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String str;
            while(true) {
                str = br.readLine();
                if(str.equals(".")) break;

                Stack<Character> stack = new Stack<>();
                boolean isBalance = true;

                for(int i=0; i<str.length(); i++) {
                    char ch = str.charAt(i);
                    if(ch == '(' || ch == '[')
                        stack.push(ch);
                    else if(ch == ')') {
                        if(stack.isEmpty() || stack.peek() != '(') {
                            isBalance = false;
                            break;
                        }  else {
                            stack.pop();
                        }
                    } else if(ch == ']') {
                        if(stack.isEmpty() || stack.peek() != '[') {
                            isBalance = false;
                            break;
                        } else {
                            stack.pop();
                        }
                    }
                }

                if(stack.isEmpty() && isBalance)
                    bw.write("yes\n");
                else
                    bw.write("no\n");
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}