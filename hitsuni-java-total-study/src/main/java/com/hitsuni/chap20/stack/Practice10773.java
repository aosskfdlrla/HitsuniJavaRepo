package com.hitsuni.chap20.stack;

import java.io.*;
import java.util.Stack;

public class Practice10773 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            Stack<Integer> stack = new Stack<>();

            int result = 0;
            int num = Integer.parseInt(br.readLine());
            for(int i=0; i<num; i++) {
                int input = Integer.parseInt(br.readLine());
                if(input == 0) {
                    if(!stack.isEmpty())
                        stack.pop();
                } else
                    stack.push(input);
            }

            int size = stack.size();
            if(!stack.isEmpty()) {
                for(int i=0; i<size; i++)
                    result += stack.pop();
            }

            bw.write(result + "\n");
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
