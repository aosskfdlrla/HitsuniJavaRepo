package com.hitsuni.section03.interfaceimplements;

import java.io.Serializable;

/* extends는 한개만, implements는 여러 개 사용 가능 */
public class Product extends Object implements InterProduct, Serializable {

    /* InterProduct의 추상 메소드는 반드시 구현해야 한다. (오버라이딩 강제화) */
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 absMethod 오버라이딩한 메소드 호출");
    }

    /* static 메소드는 오버라이딩 할 수 없다. */

    /* default 메소드는 오버라이딩이 강제화 되지 않는다. 선택적으로 오버라이딩 한다.
    * default 키워드는 인터페이스 내에서 사용하는 키워드이고 오버라이딩 시에는 제거한다.
    * */

    @Override
    public void defaultMethod() {
        System.out.println("default 함수 Product에서 오버라이딩 ");
    }
}
