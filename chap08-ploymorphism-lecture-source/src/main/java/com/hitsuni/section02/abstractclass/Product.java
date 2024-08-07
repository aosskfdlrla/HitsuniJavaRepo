package com.hitsuni.section02.abstractclass;

/* 추상클래스 선언 */
public abstract class Product {

    /* 추상 클래스는 필드를 가질 수 있다. */
    private int nonStaticField;
    private static int staticField;

    /* 추상 클래스는 생성자를 가질 수 있다.
    * 단, 직접적으로 인스턴스를 생성할 수는 없다. */
    public Product() { }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있다. */
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod");
    }

    /* 추상클래스와 일반클래스의 차이
    * 1) 미완성된 메소드를 가질 수 있는지 없는지의 차이
    * 2) 상속 받는 클래스에게 오버라이딩을 강제 할 수 있다.
    * */

    /* 추상메소드
    * 추상 메소드가 선언 된 경우 반드시 클래스에 abstract 키워드를 붙여 추상클래스로 만들어야 한다.
    * 추상 메소드가 0개인 경우 선택적으로 클래스 abstract 키워드를 붙여 추상클래스로 만들 수 있다.
    * */
    public abstract void abstractMethod();
}
