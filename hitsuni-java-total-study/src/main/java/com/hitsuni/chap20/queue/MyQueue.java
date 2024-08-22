package com.hitsuni.chap20.queue;

public class MyQueue {
    private int[] queue;
    private int front, size, rear;
    private static final int INIT_CAPACITY = 10;

    public MyQueue() {
        queue = new int[INIT_CAPACITY];
        front = 0;
        size = 0;
        rear = 0;
    }

    public void offer(int data) {
        if(size == queue.length) resize();
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int poll() {
        if(isEmpty()) return -1;
        int get = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        size--;
        return get;
    }

    public int peek() {
        return isEmpty() ? -1 : queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int newSize = queue.length * 2;
        int[] newIntQueue = new int[newSize];
        for(int i=0; i < queue.length; i++)
            newIntQueue[i] = queue[(front + i) % queue.length];
        queue = newIntQueue;
        front = 0;
        rear = size;
    }
}
