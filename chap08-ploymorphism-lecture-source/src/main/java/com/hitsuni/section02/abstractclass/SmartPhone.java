package com.hitsuni.section02.abstractclass;

/* 추상클래스를 상속 받은 경우
* 1) 추상 메소드를 반드시 오버라이딩 해주어야 한다. (오버라이딩 강제화)
* 2) 나도 미완성 클래스이다 선언(abstract 클래스가 되는 것)
* */
public class SmartPhone extends Product {

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 abstractMethod 오버라이딩 한 메소드 호출");
    }

    /* 추가 메소드 작성 */
    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone");
    }
}
