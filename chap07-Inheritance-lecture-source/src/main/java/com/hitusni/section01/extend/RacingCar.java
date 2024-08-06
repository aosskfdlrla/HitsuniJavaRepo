package com.hitusni.section01.extend;

public class RacingCar extends Car {

    public RacingCar(){

    }

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 달립니다!!");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
}
