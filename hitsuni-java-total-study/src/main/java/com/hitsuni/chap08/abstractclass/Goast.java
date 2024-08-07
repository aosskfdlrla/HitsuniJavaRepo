package com.hitsuni.chap08.abstractclass;

public class Goast extends Unit {

    public Goast(int hp, String name) {
        super(hp, name);
    }

    @Override
    public void unitAttack() {
        System.out.println("고스트가 딱총으로 공격합니다! 딱! 딱!");
    }

    public void clocking() {
        System.out.println("고스트가 은폐합니다! 안보인다!");
    }
}
