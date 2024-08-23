package com.hitsuni.chap20.stack;

import org.w3c.dom.Node;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Practice28728 {

//    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//    명령은 총 다섯 가지이다.
//
//    1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
//    2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//    3: 스택에 들어있는 정수의 개수를 출력한다.
//    4: 스택이 비어있으면 1, 아니면 0을 출력한다.
//    5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.

    static class Stack {
        private Node top;
        private int size;

        private static class Node {
            int data;
            Node next;

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        // 1 X: 정수 X를 스택에 넣는다.
        public void push(int data) {
            top = new Node(data, top);
            size++;
        }

        // 2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
        public int pop() {
            if(isEmpty() == 1) return -1;
            int data = top.data;
            top = top.next;
            size--;
            return data;
        }

        // 3: 스택에 들어있는 정수의 개수를 출력한다.
        public int size() {
            return size;
        }

        // 4: 스택이 비어있으면 1, 아니면 0을 출력한다.
        public int isEmpty() {
            if(top == null) return 1;
            return 0;
        }

        // 5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
        public int peek() {
            if(isEmpty() == 1) return -1;
            return top.data;
        }
    }

    public static String solution(String input) {
        Stack stack = new Stack();
        String result = "";
        try(BufferedReader br = new BufferedReader(new StringReader(input))) {
            //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;
            int orderNum = Integer.parseInt(br.readLine());
            for(int i=0; i<orderNum; i++) {
                st = new StringTokenizer(br.readLine());
                switch(st.nextToken()) {
                    case "1" :
                        int pNum = Integer.parseInt(st.nextToken());
                        stack.push(pNum);
                        break;
                    case "2" :
                        result = stack.pop() + "\n";
                        break;
                    case "3" :
                        result = stack.size() + "\n";
                        break;
                    case "4" :
                        result = stack.isEmpty() + "\n";
                        break;
                    case "5" :
                        result = stack.peek() + "\n";
                        break;
                    default :
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

}
