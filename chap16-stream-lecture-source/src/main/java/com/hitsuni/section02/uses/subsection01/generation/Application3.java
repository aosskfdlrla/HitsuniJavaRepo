package com.hitsuni.section02.uses.subsection01.generation;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Application3 {
    public static void main(String[] args) {
        Stream<String> splitStream = Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* Stream.of() */
        Stream<String> stringStream1 = Stream.of("hello", "world");
        Stream<String> stringStream2 = Stream.of("java", "mariadb");

        /* 스트림은 1회성으로 사용 가능하며 이미 열린 스트림은 재사용이 불가능하다. */
        stringStream1.forEach(value -> System.out.println(value + " "));
        stringStream2.forEach(value -> System.out.println(value + " "));

        /* concat() 을 이용하여 두 개의 스트림을 동일 타입 스트림으로 합칠 수 있다. */
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(value -> System.out.println(value + " "));
    }
}
