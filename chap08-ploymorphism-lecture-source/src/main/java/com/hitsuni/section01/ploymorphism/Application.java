package com.hitsuni.section01.ploymorphism;

public class Application {
    public static void main(String[] args) {
        /* Rabbit은 Rabbit 이기도 하지만 Animal 이기도 하다.
        * Tiger는 Tiger이기도 하지만 Animal 이기도 하다.
        * */

        /* 부모 타입의 레퍼런스 변수로 자식 인스턴스의 주소 값 참조가 가능하다. */
        Animal rabbit = new Rabbit();
        Animal tiger = new Tiger();

        /* 자식 타입의 레퍼런스 변수로 부모 타입의 인스턴스 주소 값 참조는 불가능하다.
        * Rabbit rabbit = new Animal();
        * Tiger tiger = new Animal();
        * */

        /* 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가 (정적 바인딩)
        * 런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작(동작 바인됨)
        * */
        rabbit.cry();
        tiger.cry();

        /* 현재 레퍼런스 변수 타입은 Animal이기 때문에 Rabbit, Tiger 메소드를 호출할 수 없다.
        * rabbit.jump();
        * tiger.bite();
        * */

        /* 형변환을 통해 호출 */
        ((Rabbit)rabbit).jump();
        ((Tiger)tiger).bite();

        /* 타입 형변환을 잚못하는 경우 ClassCaseException 발생
        * ((Tiger)Rabbit).bite();
        * */

        /* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 instanceof 연산자 */
        System.out.println("rabbit이 Rabbit 타입인지 확인 : " + (rabbit instanceof Rabbit));
        System.out.println("tiger이 tiger 타입인지 확인 : " + (tiger instanceof Tiger));
        System.out.println("rabbit이 Tiger 타입인지 확인 : " + (rabbit instanceof Tiger));
        System.out.println("tiger이 Rabbit 타입인지 확인 : " + (tiger instanceof Rabbit));

        System.out.println("rabbit이 Animal 타입인지 확인 : " + (rabbit instanceof Animal));
        System.out.println("tiger이 Animal 타입인지 확인 : " + (tiger instanceof Animal));

        System.out.println("rabbit이 Object 타입인지 확인 : " + (rabbit instanceof Object));
        System.out.println("tiger이 Object 타입인지 확인 : " + (tiger instanceof Object));

        /* up-casting : 상위 타입으로 변환  -> 묵시적으로 형변환이 가능하다.
        * down-casting : 하위 타입으로 변환 -> 명시적으로 형변환이 가능하다.
        * */

        Animal animal1 = (Animal) new Rabbit();
        Animal animal2 = new Rabbit();

        Rabbit rabbit1 = (Rabbit) animal1;
        //Rabbit rabbit2 = animal2;

    }
}
