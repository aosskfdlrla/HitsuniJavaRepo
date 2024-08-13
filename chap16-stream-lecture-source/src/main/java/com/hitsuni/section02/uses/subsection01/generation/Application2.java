package com.hitsuni.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.SortedMap;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        /* 기본 타입 스트림 생성에 대해 이해하고 사용할 수 있다. */

        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* Wrapper 클래스 자료형의 스트림으로 변환이 필요한 경우 boxing 할 수 있다. */
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환할 수 있다. */
        IntStream helloworldChars = "hello world".chars();
        helloworldChars.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 문자열을 split 해서 Stream 으로 생성할 수 있다. */
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

    }
}
