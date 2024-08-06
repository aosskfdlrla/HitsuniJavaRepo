package com.hitsuni.chap01.vaiable;

public class Overflow {
    public static void main(String[] args) {
        /* 1. 오버플로우
        * 각 자료형의 최대값을 넘어가는 경우 오버플로우가 일어나서
        * 사용자가 원하는 값을 표시할수 없다.
        * */

        /* Byte 최대값 128 (맨 앞은 부호비트)
        * 최대값 bit : 0 1 1 1 1 1 1 1 => 127
        *         +   0 0 0 0 0 0 0 1
        * -----------------------------------
        *             1 0 0 0 0 0 0 0 => -128
        * */
        byte bnum = Byte.MAX_VALUE;
        System.out.println(bnum);
        bnum += 1; // 1을 더한다.
        System.out.println(bnum);

        /* Byte 최소값 -127 (맨 앞은 부호비트)
         * 최대값 bit : 1 0 0 0 0 0 0 0 => -128
         *         -   0 0 0 0 0 0 0 1
         * -----------------------------------
         *             0 1 1 1 1 1 1 1 => 127
         * */
        byte bnum2 = Byte.MIN_VALUE;
        System.out.println(bnum2);
        bnum2 -= 1; // 1을 뺸다.
        System.out.println(bnum2);
    }
}
