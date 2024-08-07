package com.hitsuni.chap08.abstractclass;

/* 추상클래스를 선언
* class 앞에 abstract 붙인다.
* 이제 Unit 클래스는 미완성 클래스.
* */
public abstract class Unit {

    private int hp;
    private String unitName;

    /* 1. 추상 클래스는 생성자를 가질 수 있다.
    * 단, 직접적으로 인스턴스 생성은 할 수 없다!
    * 변수 초기화는 가능하다.
    * */
    public Unit() {
        this.hp = 0;
        this.unitName = "";
    }

    /* 2. 기본 생성자 외에도 다른 생성자를 가질 수 있다. */
    public Unit(int hp, String name) {
        this.hp = hp;
        this.unitName = name;
    }

    /* 3. 추상클래스도 일반 메소드를 가질 수 있다.
    * 당연히 미완성이므로 일부 완성된 메소드도 가질 수 있다고 생각하면 쉽다.
    * */
    public void unitMove() {
        System.out.println("유닛이 움직입니다.");
    }

    /* 4. 추상메소드를 가질 수 있다.
    * 미완성 된 메소드를 가질 수 있다.
    * 메소드 앞에 abstract 붙이면 된다.
    *
    * 미완성된 메소드 임으로 body "{ }" 를 가질수가 없다.
    * 컴파일러의 경고 : Abstract methods cannot have a body
    * public abstract void unitAttack() { }
    * */
    public abstract void unitAttack();
}
