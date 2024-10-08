package com.hitsuni.section03.interfaceimplements;

import java.io.Serializable;

/* 인터페이스는 인터페이스를 상속할 수 있다. 이때는 extends 라는 키워드를 사용한다.
* 클래스 extends 클래스 -> 단일 상속
* 클래스 implements 인터페이스1, 인터페이스2 -> 다중 상속
* 인터페이스 extends 인터페이스1, 인터페이스2 -> 다중 상속
* */
public interface InterProduct extends Serializable {
    /* 인터페이스는 상수 필드만 작성 가능하다.
    * 상수 필드 : public static final -> 상수의 의미
    * 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final 이다.
    * */
    int MAX_NUM = 100;
    int MIN_NUM = 0;

    /* 생성자를 사용할수 있는가?
    * Not allowed in interface
    * public InterProduct() { }
    * 인터페이스에서는 허용되지 않는다.
    * */

    /* 일반적인 메소드를 가질 수 있는가?
    * Interface abstract methods cannot have body
    * public void nonStaticMethod() {}
    * 일반 메소드를 가질 수 없다.
    * */

    /* 추상 메소드만 작성이 가능하다.
    * public abstract는 생략이 가능하다.
    * */
    public abstract void nonStaticMethod();
    void abstMethod();

    /* static 메소드는 작성 가능하다. (JDK 1.8 추가) */
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스의 staticMethod 호출");
    }

    /* default 키워드를 사용하면 non-static 메소드도 작성이 가능하다. (JDK 1.8 추가)
    * default 메소드는 완성 되어 있으므로 오버라이딩이 강제 되지 않는다.
    * 선택적 오버라이딩이 가능하다.
    * (일반적으로는 { } 만 작성하고 내용을 비워 놓는다.)
    * */
    public default void defaultMethod() {
        System.out.println("InterProduct 인터페이스의 defaultMethod 호출");
    }
}
