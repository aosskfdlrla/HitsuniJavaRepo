package com.hitsuni.chap20.queue;

import org.w3c.dom.Node;

public class MyLinkedQueue {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        private int data;
        private Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void offer(int data) {
        Node newNode = new Node(data, null);
        if(isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int peek() {
        return front.data;
    }

    public int poll() {
        int data = front.data;
        front = front.next;
        if(front == null) rear = null;
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
