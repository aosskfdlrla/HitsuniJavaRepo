package com.hitsuni.chap02.section04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/* Java Collection Framework에서는 Deque 인터페이스와 이를 구현한 클래스가 있다. */
public class Application {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // 요소 추가
        deque.addLast(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addFirst(4);

        // 요소 확인
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println("======");
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());

        // 요소 제거
        System.out.println(deque.removeFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollLast());

    }
}
