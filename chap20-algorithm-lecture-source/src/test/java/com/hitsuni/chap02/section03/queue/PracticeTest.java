package com.hitsuni.chap02.section03.queue;

import com.hitsuni.chap02.section03.queue.Practice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/* 백준 (1158) */
class PracticeTest {

    private Practice practice;

    @BeforeEach
    void setUp() {
        practice = new Practice();
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.arguments(7, 3, "<3, 6, 2, 7, 5, 1, 4>"),
                Arguments.arguments(5, 2, "<2, 4, 1, 5, 3>")
        );
    }

    @DisplayName("요세푸스 수열")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testParenthesisString(int n, int k, String expected) {
        String result = practice.solution(n, k);
        Assertions.assertEquals(expected, result);
    }
}