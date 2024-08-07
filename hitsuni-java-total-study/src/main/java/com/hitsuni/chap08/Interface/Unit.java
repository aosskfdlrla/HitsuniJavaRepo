package com.hitsuni.chap08.Interface;

public interface Unit {
    /* 1. Interface - 상수 필드만 선언이 가능하다.
    * public static final 을 붙이면 상수라는 의미
    * 단, Interface 상수 필드만 가능하기에 생략 가능
    * public static final int MAX_HP = 500;
    * */
    int MAX_HP = 500;
    int MIN_HP = 0;

    /* 2. Interface 허용되지 않는 것.
     * 1)생성자
     * Not allowed in interface
     * public Unit() { }
     * 인터페이스에서는 허용되지 않는다.
     *
     * 2)일반 메소드
     * Interface abstract methods cannot have body
     * public void unitAttack() {}
     * 일반 메소드를 가질 수 없다.
     * */

    /* 3. Interface 허용되는 것.
     * 1) 추상 메소드
     * public abstract 키워드는 생략이 가능하다.
     * */
    void unitAttack();

    /* 2) static 메소드 (JDK 1.8 추가) */
    static void unitInfo() {
        System.out.println("유닛의 정보입니다.");
    }

    /* 3) default 메소드 (JDK 1.8 추가)
    * - 접근 제한자 default 아님.
    * - default 붙으면 일반 메소드도 허용됨.
    * - 오버라이딩 강제가 되지 않음.
    * - 일반적으로 { }으로 비워놓음.
    * */
    public default void unitMove(String name) { }
}
