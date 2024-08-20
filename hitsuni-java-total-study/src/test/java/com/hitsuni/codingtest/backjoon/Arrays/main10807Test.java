package com.hitsuni.codingtest.backjoon.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class mainTest {

    private Main10807 main10807;
    private static String input, input2;

    @BeforeEach
    void SetUp() {
        main10807 = new Main10807();
        input = "1 4 1 2 4 2 4 2 3 4 4";
        input2 = "1 4 1 2 4 2 4 2 3 4 4";
     }

    public static Stream<Arguments> provideSource() {
        return Stream.of(
                Arguments.arguments(11, input, 2, 3),
                Arguments.arguments(11, input2, 5, 0)
        );
    }

    @DisplayName("갯수 세기")
    @ParameterizedTest
    @MethodSource("provideSource")
    public void testSolution(int num, String input, int find, int result) throws IOException {
        int output = Main10807.solution(num, input, find);
        Assertions.assertEquals(result, output);
    }


}