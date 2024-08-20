package com.hitsuni.chap20.list;

public class MyDoubleLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> privious;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.privious = null;
            this.next = null;
        }
    }

    /* 생성자 */
    public MyDoubleLinkedList() {
        head = null;
        size = 0;
    }

    /* 이중 연결형 리스트 데이터 추가 */
    public void add(T element) {
        /* head가 비었을 경우 */
        if(head == null) {
            head = new Node<>(element);
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(element);
            current.next.privious = current;
        }
        size++;
    }

    /* 이중 연결형 리스트 데이터 삭제 */
    public T remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        T removeElement;
        /* 삭제할 대상이 head 일 경우 */
        if(index == 0) {
            removeElement = head.data;
            head = head.next; // head 다음의 노드가 head가 됨.
            head.next.privious = null; // head 다음의 노드의 이전 노드는 없음.
        } else {
            Node<T> current = head;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            removeElement = current.data;
            current.privious.next = current.next;
            current.next.privious = current.privious;
        }
        size--;
        return removeElement;
    }
}
