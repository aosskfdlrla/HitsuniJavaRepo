package com.hitsuni.section05.parameter;

import java.lang.reflect.Parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다 */
        /* 매개변수 사용 가능 자료형
         * 1. 기본 자료형
         * 2. 기본 자료형 배열
         * 3. 클래스 자료형
         * 4. 클래스 자료형 배열
         * 5. 가변 인자
         * */
        ParameterTest pt = new ParameterTest();
        int num = 10;
        pt.testPrimaryTypeParameter(num);
        System.out.println("main num = " + num);

        int[] arr = {1, 2, 3, 4, 5};
        pt.testPrimaryTypeArrayParameter(arr);
        System.out.println("main arr[0] = " + arr[0]);
    }
}
