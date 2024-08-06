package com.hitsuni.Custom.ploymorphism;

public class Application {
    public static void main(String[] args) {
        Unit[] units = new Unit[3];

        units[0] = new Marine();
        units[1] = new Firebat();
        units[2] = new SigeTank();

        // 유닛들 이동 명령
        for(Unit unit : units) {
            unit.move();
        }

        System.out.println();

        // 유닛들 공격 명령
        for(Unit unit : units) {
            unit.attack();
        }

        System.out.println();
        
        // 유닛의 최후
        for(Unit unit : units) {
            unit.die();
        }

    }
}
