package com.hitsuni.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메소드에 대해 이해할 수 있다. */

        /* 추상 클래스는 인스턴스 생성 불가
        * 'Product' is abstract; cannot be instantiated
        * Product product = new Product();
        * */
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 다형성을 적용해서 추상 클래스를 레퍼런스 타입으로 사용할 수 있다.
        * product.abstractMethod();
        * Product 클래스의 abstractMethod가 호출 되는 것 처럼 보이나
        * 실제로는 동적 바인딩이 일어나 상속받은 smartPhone의 오버라이딩 된 메소드가 호출이 된다.
        * */
        Product product = new SmartPhone();
        product.abstractMethod();
    }
}
