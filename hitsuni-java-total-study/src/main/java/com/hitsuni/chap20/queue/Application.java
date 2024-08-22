package com.hitsuni.chap20.queue;

public class Application {
    public static void main(String[] args) {
        MyArrayQueue<Integer> queue = new MyArrayQueue<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);
        queue.offer(queue.poll());
        queue.offer(queue.poll());
        System.out.println(queue.peek());

        MyQueue intQueue = new MyQueue();
        intQueue.offer(1);
        System.out.println(intQueue.peek());
    }
}
