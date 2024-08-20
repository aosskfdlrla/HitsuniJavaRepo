package com.hitsuni.chap02.section02.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/* 괄호 - 백준(9012) */
class PracticeTest {

    private Practice practice;

    @BeforeEach
    void setUp() {
        practice = new Practice();
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.arguments("(())())","NO"),
                Arguments.arguments("(((()())()","NO"),
                Arguments.arguments("(()())((()))","YES"),
                Arguments.arguments("((()()(()))(((())))()","NO"),
                Arguments.arguments("()()()()(()()())()","YES"),
                Arguments.arguments("(()((())()(","NO")
        );
    }

    @DisplayName("올바른 괄호 문자열 테스트")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testParenthesisString(String input, String expected) {
        String result = practice.solution(input);
        Assertions.assertEquals(expected, result);
    }

}