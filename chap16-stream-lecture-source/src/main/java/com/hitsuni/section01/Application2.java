package com.hitsuni.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 병렬 처리에 대해 이해할 수 있다. */
        List<String> list = new ArrayList<>(Arrays.asList("java", "mariadb", "html", "css", "mybatis"));

        System.out.println("foreach ==============");
        for(String s : list)
            System.out.println(s + " : " + Thread.currentThread().getName());

        for(String s : list)
            System.out.println(s + " : " + Thread.currentThread().getName());

        /* 일반적인 스트림도 main 스레드에서 작업을 수행한다. */
        System.out.println("normal =============");
        list.stream().forEach(Application2::print);
        list.stream().forEach(Application2::print);

        /* 병렬 스트림은 자동으로 병렬 처리가 되며 성능 상 유리하다.
        * 스트림을 활용하면 병렬 처리가 손쉽다는 것이 장점 중 하나이다.
        *  */
        System.out.println("parellel stream =============");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);

    }

    private static void print(String str) {
        System.out.println(str + " " + Thread.currentThread().getName());
    }

}
