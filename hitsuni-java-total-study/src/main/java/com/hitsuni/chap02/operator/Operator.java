package com.hitsuni.chap02.operator;

public class Operator {
    public static void main(String[] args) {
        /* 1. 연산자
        * 프로그램이 연산하는 과정 속에서 사용하는 연산자이다.
        * 각 연산자에는 우선순위와 결합 법칙이 있다.
        *
        * 대부분의 연산자의 우선순의는 초등학교에서 배웠던
        * 우선 순위 같이 상식선에서 알아낼 수 있다.
        * 다만, 예외적인 부분들이 있으므로 그 부분들만을 정리한다.
        * */

        /* 전위연산자
        * ++(자료형)
        * 값이 참조되기 전에 값을 증가시킴
        *
        * 후위연산자
        * (자료형)++
        * 값이 참조된 후에 값을 증가시킴
        * */
        int num1 = 20;
        int num2 = 20;

        /* 단독으로 사용되었을 때는 상관이 없다. */
        ++num1;
        num2++;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 20;
        int num4 = 20;

        /* 전위 연산자와 후위 연산자의 덧셈 연산 결과를 보자 */
        System.out.println(++num3 + num4); // num3은 + 연산 전 즉, 참조 이전에 값이 증가 21 이후 num4 20과 덧셈 결과 41

        int num5 = 20;
        int num6 = 20;
        System.out.println(num5 + num6++); // num6은 + 연산 후 즉, 덧셈이 끝난 후에 값이 증가 따라서 덧셈에는 영향을 주지 않음.

        int a = 10;
        int b = 10;
        short c = 10;
        byte d = 10;
        long e = 10;
        float f = 10.0f;
        double x = 10.0;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(x <= a);
        System.out.println(a == f);
        System.out.println(f == x);
        // System.out.println(a *= (b + ++a));


    }
}
