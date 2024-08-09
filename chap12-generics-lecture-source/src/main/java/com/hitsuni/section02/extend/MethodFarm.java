package com.hitsuni.section02.extend;

public class MethodFarm {

    /* 메소드 매개변수로 전달 받는 타입 제한 */
    public <T> void animalType(T t1, T t2) {}

    public void mammalType(Bunny bunny) {
    }

    public void reptileType(Reptile reptile) {
    }
}
