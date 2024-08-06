package com.hitsuni.Custom.ploymorphism;

public class Marine extends Unit {

    public Marine() {
        this.unitName = "Marine";
        this.unitType = "Terran";
        this.hp = 40;
        this.attackPower = 6;
        this.armor = 0;
        this.shield = 0;
    }

    @Override
    public void birth() {
        System.out.println("마린이 생산되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("마린이 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("마린이 멈추었습니다.");
    }

    @Override
    public void attack() {
        System.out.println("마린이 공격합니다. 두두두두두 (공격력 6)");
    }

    @Override
    public void hold() {
        System.out.println("마린이 현재위치를 사수합니다.");
    }

    @Override
    public void patrol() {
        System.out.println("마린이 순찰을 돕니다.");
    }

    @Override
    public void die() {
        System.out.println("마린이 죽었습니다.");
    }

    public void steamPack() {
        System.out.println("마린이 스팀팩을 사용하였습니다.");
    }
}
