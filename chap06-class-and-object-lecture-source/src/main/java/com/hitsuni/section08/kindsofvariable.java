package com.hitsuni.section08;

public class kindsofvariable {
    /* 다양한 변수를 이해하고 사용할 수 있다. */

    private int globalNum; // 전역 변수, 인스턴스 변수 -> 인스턴스 생성 시
    private static int staticNum; //

    public void method(int num) { // 매개변수 (일종의 지역변수)
        int localNum; // 지역변수

        /* 매개변수는 호출 시 값이 전달 되어 초기화 되지만 지역 변수는 선언 외에 사용을 위해서는
         * 반드시 초기화 되어야만 한다.
         * */
        System.out.println(num);
    }
}
