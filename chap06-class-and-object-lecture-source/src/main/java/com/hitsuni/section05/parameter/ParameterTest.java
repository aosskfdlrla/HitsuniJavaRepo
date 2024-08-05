package com.hitsuni.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    /* 1. 기본 자료형 */
    public void testPrimaryTypeParameter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParameter num = " + num);
    }

    /* 2. 기본 자료형 배열 */
    public void testPrimaryTypeArrayParameter(int[] arr) {
        arr[0] = 99;
        System.out.println("testPrimaryTypeArrayParameter" + Arrays.toString(arr));
    }
}
