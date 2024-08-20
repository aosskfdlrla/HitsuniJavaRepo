package com.hitsuni.chap02.section04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class practiceTest01 {
    private Practice practice;

    @BeforeEach
    void setUp() {
        practice = new Practice();
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.arguments(new Integer[]{3, 2, 1, -3, -1}, "1 4 5 3 2"),
                Arguments.arguments(new Integer[]{2, 1, -3, -1}, "1 3 2 4"),
                Arguments.arguments(new Integer[]{-1, 2, 1}, "1 3 2")
        );
    }

    @DisplayName("풍선 터트리기 테스트")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testSolution(Integer[] notes, String expected) {
        String result = practice.solution(notes);
        Assertions.assertEquals(expected, result);
    }
}
