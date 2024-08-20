package com.hitsuni.chap20.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Java Collection Framework에는 ArrayList, LinkedList 등이 구현 되어 있다. */
/*
배열 기반 : 메모리 효율성이 높고 캐시 지역성이 좋지만(조회 성능), 고정된 크기와 동적 크기 조정의 복잡성이 있다.
연결 리스트 기반 : 동적 크기 조정이 가능하며 변경이 용이하다. 또한 메모리 오버헤드(포인터)가 있지만 메모리 사용이 효율적이다.
 */
public class Application {
    public static void main(String[] args) {
        /* ArrayList */
        List<Integer> list = new ArrayList<>();

        // 요소 추가
        list.add(1);
        list.add(2);
        list.add(3);

        // 요소 조회 : get()
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // for문 사용
        for(Integer integer : list) System.out.print(integer + " ");

        System.out.println();

        // 특정 인덱스 수정 : set()
        list.set(0, 5);
        list.set(1, 3);
        for(Integer integer : list) System.out.print(integer + " ");

        System.out.println();

        // 특정 인덱스 삭제 : remove()
        list.remove(0);
        for(Integer integer : list) System.out.print(integer + " ");

        // list 초기화 : clear()
        list.clear();

        System.out.println();

        // list 비었는지 여부
        System.out.println(list.isEmpty());
    }
}