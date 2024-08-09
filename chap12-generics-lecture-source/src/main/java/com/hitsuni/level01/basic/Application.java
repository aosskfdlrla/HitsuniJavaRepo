package com.hitsuni.level01.basic;

public class Application {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
        //System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }

    /* T는 여러가지 자료형을 받을 수 있도록 하는 형태이고
    * 내부적으로는 Number 다 다룰 수있는 double 로 계산 처리를 한다.
    * */
    public static <T extends Number> double sum(T[] tArr) {
        double result = 0.0;

        for(T arr : tArr)
            result += arr.doubleValue();

        return result;
    }
}
