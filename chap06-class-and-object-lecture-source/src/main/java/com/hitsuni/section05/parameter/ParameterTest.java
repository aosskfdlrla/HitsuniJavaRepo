package com.hitsuni.section05.parameter;

import java.awt.*;
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

    /* 3. 클래스 자료형 */
    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.setWidth(32.5);
        rectangle.setHeight(42.5);
        System.out.println("testClassTypeParameter rectangle.getWidth() = " + rectangle.getWidth());
        System.out.println("testClassTypeParameter rectangle.getHeight() = " + rectangle.getHeight());
    }

    /* 5. 가변인자
     * 인자로 전달하는 값의 개수가 정해져 있지 않은 경우 활용
     * */
    public void testVariableLengthArrayParameter(String name, String... hobby) {
        System.out.println("이름 : " + name);
        System.out.println("취미의 개수 : " + hobby.length);
        System.out.println("취미 : " + Arrays.toString(hobby));
    }

    /* 가변인자를 사용한 메소드는 오버로딩을 할 수 없다. 오버로딩을 하게 되면 모호해지는 문제가 있기 때문 */
    //public void testVariableLengthArrayParameter(String... hobby) {}
}
