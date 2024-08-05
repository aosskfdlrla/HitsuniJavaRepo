package com.hitsuni.section01.user_type;

import java.util.Arrays;
import java.util.SortedMap;

public class Application {
    public static void main(String[] args) {
        /* 사용자 정의 자료형 사용하기 */

        /* 변수 선언 및 객체 생성
         * 클래스명 변수명 = new 클래스명(); <- 객체(instance)를 생성하는 구문
         * 1. Stack 영역에 member 레퍼런스 변수(메모리 주소값) 메모리 공간 확보
         * 2. Heap 영역에 사용자가 정의한 member 클래스에 정의된 필드(전역변수)와
         *    메소드대로 메모리 공간이 확보됨.*/
        Member member = new Member();

        /* 필드에 접근하기 위해 레퍼런스명.필드명 으로 접근한다.
         * '.'은 참조 연산자이다. 레퍼런스 변수가 참조하는 주소로 접근한다는 의미를 가짐.
         * heap 영역은 기본적으로 JVM 초기값으로 초기화 된다. */
        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 10;
        member.gender = 'M';
        member.hobby = new String[] {"축구", "야구", "코딩"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + Arrays.toString(member.hobby));
    }
}
