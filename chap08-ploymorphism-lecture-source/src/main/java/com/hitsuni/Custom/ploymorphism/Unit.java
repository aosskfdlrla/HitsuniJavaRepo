package com.hitsuni.Custom.ploymorphism;

public class Unit {
    String unitName;
    String unitType;
    int hp;
    int attackPower;
    int armor;
    int shield;

    public Unit() {
        this.unitName = "null";
        this.unitType = "null";
        this.hp = 0;
        this.attackPower = 0;
        this.armor = 0;
        this.shield = 0;
    }

    public Unit(String unitName, String unitType, int hp, int attackPower, int armor, int shield) {
        this.unitName = unitName;
        this.unitType = unitType;
        this.hp = hp;
        this.attackPower = attackPower;
        this.armor = armor;
        this.shield = shield;
    }

    public void birth() {
        System.out.println("유닛이 생산되었습니다.");
    }

    public void move() {
        System.out.println("유닛이 움직입니다.");
    }

    public void stop() {
        System.out.println("유닛이 멈춥니다.");
    }

    public void attack() {
        System.out.println("유닛이 공격을 합니다.");
    }

    public void hold() {
        System.out.println("유닛이 자리를 사수합니다.");
    }

    public void patrol() {
        System.out.println("유닛이 순찰을 돕니다.");
    }

    public void die() {
        System.out.println("유닛이 죽었습니다.");
    }
}
