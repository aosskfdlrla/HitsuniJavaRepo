package com.hitsuni.chap08.abstractclass;

/* 1. 추상 클래스 상속 받았을 때
* 컴파일러 경고 : Class 'Marine' must either be declared abstract or
* implement abstract method 'unitAttack()' in 'Unit'
* -> 반드시 미완성된 메소드 구현해야 한다.
* 2가지 선택지가 있다.
* 1) unitAttack 오버라이딩
* 2) Marine class abstract 선언
* */
public class Marine extends Unit {

    public Marine(int hp, String name) {
        super(hp, name);
    }

    /* 미완성된 메소드 오버라이딩 구현 */
    @Override
    public void unitAttack() {
        System.out.println("마린이 공격합니다 두두두두!");
    }

    /* 추가로 메소드 구현 가능 */
    public void steamPack() {
        System.out.println("마린의 공격 속도가 증가합니다!");
    }
}
