package com.hitsuni.chap20.list;

/* 1. ArrayList
* 다른 데이터 형들도 사용하기 위해 제네릭 사용
* Java 제공 ArrayList 가 대략적으로 이런 형태를 하고 있다는 것을 알아두면 좋다.
* */
public class MyArrayList<T> {
    private T[] data;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /* List 데이터 추가 함수 add */
    public void add(T element) {
        /* 배열이 가득 찼을 경우 resize 하여 자동으로 배열의 크기를 늘린다. */
        if(size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    /* List 데이터 조회 함수 get */
    public T get(int index) {
        /* 조회하고자 하는 인덱스의 크기가 배열의 크기를 넘어가면 예외 발생 */
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        return data[index];
    }

    /* List 데이터 삭제 함수 remove - 데이터를 꺼내면서 지움 */
    public T remove(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");

        /* 삭제할 인덱스의 element */
        T removedElement = data[index];

        /* 삭제한 배열의 인덱스부터 한칸씩 당겨 주기*/
        for(int i=index; i < size - 1; i++)
            data[i] = data[i + 1];
        data[--size] = null;

        return removedElement;
    }

    /* List 크기를 구하는 함수 size() */
    public int size() {
        return size;
    }

    /* List 비었는지 아닌지 구하는 함수 isEmpty() */
    public boolean isEmpty() {
        return size == 0;
    }

    /* List 크기가 꽉 차서 추가로 공간이 필요한 경우 resize() */
    @SuppressWarnings("unchecked")
    private void resize() {
        int newSize = data.length * 2; // 기본적으로 2배로 늘린다.
        T[] newData = (T[]) new Object[newSize];
        System.arraycopy(data, 0, newData, 0, size); // 배열 복사
        data = newData;
    }
}
