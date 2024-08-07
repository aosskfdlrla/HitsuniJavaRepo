package com.hitsuni.chap08.abstractclass;

public class SigeTank extends Unit {

    public SigeTank(int hp, String name) {
        super(hp, name);
    }

    @Override
    public void unitAttack() {
        System.out.println("시즈탱크가 대포로 공격합니다! 퉁! 퉁!");
    }

    public void sigeMode() {
        System.out.println("시즈탱크가 시즈모드를 해서 폭격합니다! 쾅! 쾅!");
    }
}
