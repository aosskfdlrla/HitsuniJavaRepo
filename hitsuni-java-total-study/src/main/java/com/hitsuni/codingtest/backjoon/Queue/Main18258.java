package com.hitsuni.codingtest.backjoon.Queue;

import java.io.*;
import java.util.StringTokenizer;

class IntQueue {
    private Node front;
    private Node rear;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // 1. push X: 정수 X를 큐에 넣는 연산이다.
    public void offer(int data) {
        Node newNode = new Node(data, null);
        if(isEmpty() == 1) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // 2. pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int poll() {
        if(isEmpty() == 1) return -1;
        int data = front.data;
        front = front.next;
        size--;
        return data;
    }

    // 3. size: 큐에 들어있는 정수의 개수를 출력한다.
    public int size() {
        return size;
    }

    // 4. empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
    public int isEmpty() {
        return front == null ? 1 : 0;
    }

    // 5. front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int peek() {
        if(isEmpty() == 1) return -1;
        return front.data;
    }

    // 6. back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int back() {
        if(isEmpty() == 1) return -1;
        return rear.data;
    }
}

public class Main18258 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            IntQueue queue = new IntQueue();
            int orderNum = Integer.parseInt(br.readLine());
            for(int i=0; i < orderNum; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch(st.nextToken()) {
                    case "push" :
                        int num = Integer.parseInt(st.nextToken());
                        queue.offer(num);
                        break;

                    case "pop" :
                        bw.write(queue.poll()+"\n");
                        break;

                    case "size" :
                        bw.write(queue.size()+"\n");
                        break;

                    case "empty" :
                        bw.write(queue.isEmpty()+"\n");
                        break;

                    case "front" :
                        bw.write(queue.peek()+"\n");
                        break;

                    case "back" :
                        bw.write(queue.back()+"\n");
                        break;
                }
            }
            bw.flush();
            bw.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
