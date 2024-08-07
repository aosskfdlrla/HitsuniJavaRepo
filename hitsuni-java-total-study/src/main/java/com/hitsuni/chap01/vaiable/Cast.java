package com.hitsuni.chap01.vaiable;

public class Cast {
    public static void main(String[] args) {
        /* 1. 캐스팅(casting)
        * 자료형을 원하는 다른 자료형으로 변환이 가능하다.
        * 1) 암묵적 캐스팅
        * 2) 명시적 캐스팅
        * 이렇게 2가지로 볼 수 있음.
        * */

        /* 암묵적 캐스팅
        * 주로 작은 자료형에서 큰 자료형으로 변환할 때 변환할 자료형 생략 가능
        * */

        /* bnum                0 1 1 1 1 1 1 1 => byte 127
        * => 0 0 0 0 0 0 0 0 | 0 1 1 1 1 1 1 1 => short 127
        *  */
        byte bnum = Byte.MAX_VALUE;
        System.out.println(bnum);

        short snum = bnum;
        System.out.println(snum);

        /* 명시적 캐스팅
        * 주로 큰 자료형에서 작은 자료형으로 변환할 때 꼭 명시적으로
        * 변환할 자료형을 생성해주어야 한다.
        * */

        /* inum2 최대값
        * 0 1 1 1 1 1 1 | 1 1 1 1 1 1 1 1 | 1 1 1 1 1 1 1 1 | 1 1 1 1 1 1 1 1  => 2147483647
        * => (데이터 손실)                    1 1 1 1 1 1 1 1 | 1 1 1 1 1 1 1 1  => -1
        * int 형 자료형을 short 형으로 2 Byte로 형변환을 해준다.
        *
        * short 는 최대 2 byte 이므로 -1을 표시하게 된다.
        * */
        int inum2 = Integer.MAX_VALUE;
        System.out.println(inum2);
        short snum2 = (short)inum2;
        System.out.println(snum2);

        int unum = 10;
        float fnum = unum;

        System.out.println(fnum);

        char charw = 'a';

        int nnum = 220;
        charw = (char) nnum;
        System.out.println(charw);
    }
}
