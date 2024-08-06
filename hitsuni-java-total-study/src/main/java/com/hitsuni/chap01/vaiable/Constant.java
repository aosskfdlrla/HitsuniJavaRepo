package com.hitsuni.chap01.vaiable;

public class Constant {
    public static void main(String[] args) {
        /* 1. 상수(Constant)
        * 변수와 동일하게 데이터를 저장할 수 있는 공간
        * 단, 한번 메모리에 저장되면 변경할 수 없다.
        * */
        /* 상수 선언과 초기화 */
        final int AGE = 20;
        System.out.println(AGE);

        //AGE = 21;
        System.out.println(AGE);
    }
}
