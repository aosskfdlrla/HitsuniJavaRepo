package com.hitsuni.Custom.ploymorphism;

public class SigeTank extends Unit {

    public SigeTank() {
        this.unitName = "SigeTank";
        this.unitType = "Terran";
        this.hp = 150;
        this.attackPower = 30;
        this.armor = 1;
        this.shield = 0;
    }

    @Override
    public void birth() {
        System.out.println("시즈탱크가 생산되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("시즈탱크가 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("시즈탱크가 멈추었습니다.");
    }

    @Override
    public void attack() {
        System.out.println("시즈탱크가 공격합니다. 퉁퉁! 퉁퉁! (공격력 30)");
    }

    @Override
    public void hold() {
        System.out.println("시즈탱크가 현재 위치를 사수합니다.");
    }

    @Override
    public void patrol() {
        System.out.println("시즈탱크가 순찰을 돕니다.");
    }

    @Override
    public void die() {
        System.out.println("시즈탱크가 터졌습니다.");
    }

    public void sigeMode() {
        System.out.println("시즈탱크가 시즈모드를 했습니다. 슝슝!");
    }
}
