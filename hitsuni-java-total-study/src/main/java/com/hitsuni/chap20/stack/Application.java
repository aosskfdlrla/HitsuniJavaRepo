package com.hitsuni.chap20.stack;

import com.hitsuni.chap20.list.MyLinkedList;

import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /* 요소 추가 */
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        MyLinkedListStack<Integer> myStack = new MyLinkedListStack<>();

        myStack.push(1);
        myStack.push(2);
    }
}
