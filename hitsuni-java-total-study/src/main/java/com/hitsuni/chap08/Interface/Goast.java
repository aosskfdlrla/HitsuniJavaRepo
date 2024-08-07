package com.hitsuni.chap08.Interface;

public class Goast extends UnitObject implements Unit {

    public Goast(int hp, String name) {
        super(hp, name);
    }

    @Override
    public void unitAttack() {
        System.out.println("고스트가 딱총으로 공격합니다! 딱! 딱! 딱!");
    }

    @Override
    public void unitMove(String name) {
        System.out.println("고스트가 움직입니다! 무빗");
    }

    @Override
    public void unitDie() {
        System.out.println("고스트가 죽었습니다. 으앙");
    }

    public void goastClocking() {
        System.out.println("고스트가 은폐했습니다. 안보영~");
    }
}
