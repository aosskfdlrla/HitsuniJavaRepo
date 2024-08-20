package com.hitsuni.chap20.list;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    /*
       정적 내부 클래스
       독립성 : Node 클래스는 노드를 정의하는 데 필요한 데이터만 포함하고 있으며, 인스턴스 상태와는 직접적인 관계가 없다.
       메모리 효율성 : 정적 내부 클래스는 외부 클래스의 인스턴스 상태에 접근할 수 없기 때문에, 인스턴스 내부 클래스에 비해 메모리 사용이 더 효율적일 수 있다.
       캡슐화 : Node 클래스가 내부에서만 사용되므로, 외부에 노출되지 않도록 숨길 수 있다. 이는 정보 은닉과 캡슐화를 통해 설계를 깔끔하게 유지하는 데 도움이 된다.
    */
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /* LinkedList 생성자 : head 없음, size 0 */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /* LinkedList 데이터 저장 */
    public void add(T element) {
        /* head 비었을 경우*/
        if(head == null) {
            head = new Node<>(element);
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(element);
        }
        size++;
    }

    /* LinkedList 해당 인덱스 데이터 조회 */
    public T get(int index) {
        /* 리스트의 Index 크기를 벗어나면 Exception */
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        Node<T> current = head;
        for(int i = 0; i < index; i++)
            current = current.next;
        return current.data;
    }

    /* LinkedList 해당 인덱스 데이터 삭제 */
    public T remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        T removedElement;
        /* 삭제할 대상이 첫번째 head 노드일 경우 */
        if(index == 0) {
            /* head 데이터 담은 후 head 다음의 노드를 head 로 지정 */
            removedElement = head.data;
            head = head.next;
        } else {
            /* 단일 링크드 리스트임으로
            * 삭제할 대상의 전 노드에서 다음 노드의 값(삭제할 대상이 가지고 있는 값)
            * 을 가져오고 현 노드에서 다음노드와 연결 해준다.
            *  */
            Node<T> current = head;
            for(int i = 0; i < index - 1; i++)
                current = current.next;
            removedElement = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
