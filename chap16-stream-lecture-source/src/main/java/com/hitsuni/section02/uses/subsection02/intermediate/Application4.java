package com.hitsuni.section02.uses.subsection02.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {
        /* 스트림이 중계 연산 중 sorted에 대해 이해하고 사용할 수 있다. */

        List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 55)
                .boxed()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(integerList);
    }
}
