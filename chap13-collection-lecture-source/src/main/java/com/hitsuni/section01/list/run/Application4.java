package com.hitsuni.section01.list.run;

import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        /* Stack 에 대해서 이해하고 활용할 수 있다. */
        Stack<Integer> integerStack = new Stack<>();

        /* Stack 에 값을 추가할 때는 push() 메소드를 사용한다.
        * add()도 가능하기는 하지만 Vector의 메소드이므로 push를 사용하는 것이 좋다.
        * | 5 |
        * | 4 |
        * | 3 |
        * | 2 |
        * | 1 |
        * ㅡㅡㅡ
        * 이렇게 데이터가 쌓여서 저장이 된다.
        *  */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        /* Stack 에서 요소를 찾을 때 search() 메소드 사용
        * 인덱스가 아닌 위에서부터인 곳에서 찾아온다
        * */
        System.out.println("integerStack : " + integerStack);

        /* 스택에서 요소를 꺼내는 메소드
        * peek() : 가장 마지막(상단)에 있는 요소 반환
        * pop() : 가장 마지막(상단)에 있는 요소 변환 후 제거
        * */
        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

        /* 꺼내면서 요소를 제거하기 때문에 스택이 비어있는 경우에는 Java.util.EmptyStackException 이 발행. */
        System.out.println("pop() : " + integerStack.pop());
        System.out.println(integerStack);
        System.out.println();

    }
}
