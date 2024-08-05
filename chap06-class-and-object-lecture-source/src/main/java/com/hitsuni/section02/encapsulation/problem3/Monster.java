package com.hitsuni.section02.encapsulation.problem3;

public class Monster {
    /* Monster 클래스에 변경 사항이 발생하였다.
     * name -> kinds로 변경 */
    private String name;
    String kinds;
    private int hp;

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getInfo() {
        return "몬스터의 이름은 " + this.name + "입니다.";
    }

    public int getHp() {
        return hp;
    }
}
