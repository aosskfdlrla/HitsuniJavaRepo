package com.hitsuni.Custom.ploymorphism;

public class Firebat extends Unit {

    public Firebat() {
        this.unitName = "Firebat";
        this.unitType = "Terran";
        this.hp = 50;
        this.attackPower = 16;
        this.armor = 0;
        this.shield = 0;
    }

    @Override
    public void birth() {
        System.out.println("파이어뱃이 생산되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("파이어뱃이 움직입니다.");
    }

    @Override
    public void stop() {
        System.out.println("파이어뱃이 멈춥니다.");
    }

    @Override
    public void attack() {
        System.out.println("파이어뱃이 공격합니다. FIRE~~");
    }

    @Override
    public void hold() {
        System.out.println("파이어뱃이 현재 위치를 사수합니다.");
    }

    @Override
    public void patrol() {
        System.out.println("파이어뱃이 순찰을 돕니다.");
    }

    @Override
    public void die() {
        System.out.println("파이어뱃이 죽었습니다.");
    }

    public void steamPack() {
        System.out.println("파이어뱃이 스팀팩을 사용합니다.");
    }
}
