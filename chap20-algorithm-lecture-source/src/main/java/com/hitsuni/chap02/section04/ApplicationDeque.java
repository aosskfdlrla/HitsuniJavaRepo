package com.hitsuni.chap02.section04;

import java.util.ArrayDeque;
import java.util.Deque;

public class ApplicationDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.clear();
        System.out.println();

        deque.add(1);
        deque.add(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        System.out.println();

        System.out.println(deque.getFirst());
        System.out.println(deque);

        System.out.println();
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println();

        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println();

        System.out.println(deque.pollLast());
        System.out.println(deque);

        System.out.println(deque.poll());
        System.out.println(deque);

        System.out.println(deque.pop());
        System.out.println(deque);

        System.out.println("==============================");
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        System.out.println(deque);
        deque.addLast(deque.pollFirst());
        System.out.println(deque);
        deque.addLast(deque.pollFirst());
        System.out.println(deque);




    }
}
