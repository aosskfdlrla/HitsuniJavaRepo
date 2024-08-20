package com.hitsuni.chap08.Interface;

public class SigeTank extends UnitObject implements Unit {

    public SigeTank(int hp, String name) {
        super(hp, name);
    }

    @Override
    public void unitAttack() {
        System.out.println("시즈탱크가 대포로 공격합니다! 퉁! 퉁!");
    }

    @Override
    public void unitMove(String name) {
        System.out.println("시즈탱크가 움직입니다. 부릉 부릉~~");
    }

    @Override
    public void unitDie() {
        System.out.println("시즈탱크가 터졌습니다! 콰콰쾅!");
    }

    public void sigeMode() {
        System.out.println("시즈탱크가 시즈모드를 했습니다.");
    }


}
