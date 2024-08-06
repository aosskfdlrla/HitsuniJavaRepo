package com.hitusni.section03.overriding;

public class SubClass extends SuperClass {

    @Override
    public void method(int num) { }

    /* private 메소드 오버라이딩 불가
    * @Override
    * public void privateMethod() {}
    * */

    /* final 메소드 오버라이딩 불가
    * @Override
    * public void finalMethod() {}
    * */

    /* protected -> default 로 변경 시 더 좁은 범위로의 변경이라 불가
    * @Override
    * void protectedMethod() {}
    * */

    @Override
    public void protectedMethod() {}

}
