package com.hitsuni.chap08.Interface;

public abstract class UnitObject {

    private int hp;
    private String name;

    public UnitObject() {
        this.hp = 0;
        this.name = "";
    }

    public UnitObject(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public abstract void unitDie();
}
