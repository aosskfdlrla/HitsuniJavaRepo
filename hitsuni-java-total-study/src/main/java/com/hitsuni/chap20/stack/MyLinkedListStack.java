package com.hitsuni.chap20.stack;

import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private Node<T> top; // 스택의 상단 노드

    // 노드 클래스
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    /* 스택에 요소 추가
    * 첫 push : data, top 푸시
    * 1) Node<T> top = null 임.
    * 2) 첫 push 때 null 값과 data 담기는 push 일어난 후 top 은 첫 노드의 주소를 가지게 됨.
    * 3) 두 번쨰 push 떄 첫 노드의 주소를 가지고 있는 top 과 data 가 두번쨰 노드가 생성됨.
    * */
    public void push(T data) {
        top = new Node<>(data, top);
    }

    /* 스택에 요소 제거 */
    public T pop() {
        if(isEmpty()) throw new EmptyStackException();
        T data = top.data;
        top = top.next;
        return data;
    }

    /* 스택 상단 요소 반환 */
    public T peek() {
        if(isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    /* 스택이 비어있는지 확인 */
    public boolean isEmpty() {
        return top == null;
    }

}
