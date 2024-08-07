package com.hitsuni.chap08.Interface;

/* 1. 인터페이스 상속 받았을 때 (implements)
* 컴파일러 경고 : Class 'Marine' must either be declared
* abstract or implement abstract method 'unitAttack()' in 'Unit'
* 상속 클래스 상속 받았을 때와 같다.
* + 추가로 상속 받고 인터페이스도 상속 받을 수 있다.
* + implements 여러개의 인터페이스를 상속 받을 수 있다.
*  */
public class Marine extends UnitObject implements Unit {

    public Marine(int hp, String name) {
        super(hp, name);
    }

    @Override
    public void unitAttack() {
        System.out.println("마린이 공격합니다! 두두두두!");
    }

    /* default 메소드 오버라이딩은 선택사항 */
    @Override
    public void unitMove(String name) {
        System.out.println("마린이 움직입니다.");
    }

    @Override
    public void unitDie() {
        System.out.println("마린이 죽었습니다.");
    }

    /* 추가 작성 */
    public void steamPack() {
        System.out.println("마린의 공격 속도가 빨라집니다!");
    }
}
