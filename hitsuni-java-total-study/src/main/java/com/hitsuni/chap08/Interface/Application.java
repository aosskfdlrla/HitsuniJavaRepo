package com.hitsuni.chap08.Interface;

/* 인터페이스를 활용한 다형성 */
public class Application {
    public static void main(String[] args) {

        /* 1. 인터페이스 형의 인스턴스 생성 */
        Unit unit1 = new Marine(40, "Marine");
        Unit unit2 = new SigeTank(150, "SigeTank");
        Unit unit3 = new Goast(45, "Goast");

        /* 2. 다형성 확인
         * 인터페이스의 unitAttack() 껍데기 메소드로 갈거 같으나
         * 동적 바인딩으로 Unit을 상속 받은 Marine, SigeTank, Goast 의 오버라이딩한 클래스의 메소드가 호출이 됨.
         * */
        unit1.unitAttack();
        unit2.unitAttack();
        unit3.unitAttack();

        /* 3. UnitObject 호출
        * 추상클래스와 마찬가지로 형변환을 하면 사용할 수 있다.
        * */
        ((UnitObject)unit1).unitDie();
        ((UnitObject)unit2).unitDie();
        ((UnitObject)unit3).unitDie();
    }
}
