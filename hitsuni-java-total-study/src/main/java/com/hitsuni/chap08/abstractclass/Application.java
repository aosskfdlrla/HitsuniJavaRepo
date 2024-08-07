package com.hitsuni.chap08.abstractclass;

/* 추상클래스를 활용한 다형성 */
public class Application {
    public static void main(String[] args) {

        /* 1. 추상클래스 자체는 인스턴스를 할 수 없다.
        * 미완성이기 때문에 당연히 메모리 상으로 올릴 수 없다.
        * 컴파일러 경고 : 'Unit' is abstract; cannot be instantiated
        * Unit unit = new Unit();
        * */

        Unit unit1 = new Marine(40, "Marine");
        Unit unit2 = new SigeTank(150, "Tank");
        Unit unit3 = new Goast(45, "Goast");

        /* 2. 다형성 확인
        * 추상클래스의 unitAttack() 호출 될거 같으나
        * 동적 바인딩으로 Unit을 상속 받은 Marine, SigeTank, Goast 의 오버라이딩한 클래스의 메소드가 호출이 됨.
        * */
         unit1.unitAttack();
         unit2.unitAttack();
         unit3.unitAttack();

         /* 3. 상속 받은 클래스의 고유 능력 사용
         * 상속과 같이 다운 캐스팅을 통해 각 클래스에서 추가로 작성된 메소드를 사용할 수 있다.
         * */
        ((Marine)unit1).steamPack();
        ((SigeTank)unit2).sigeMode();
        ((Goast)unit3).clocking();

    }
}
