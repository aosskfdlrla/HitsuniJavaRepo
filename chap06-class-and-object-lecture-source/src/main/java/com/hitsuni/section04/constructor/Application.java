package com.hitsuni.section04.constructor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /* 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* 생성자 사용 목적
         * 1. 인스턴스 생성 시점에 수행할 명령이 있을 때
         * 2. 매개변수 있는 생성자의 경우 매개변수로 전달 맏은 값을 필드 초기화 할 때
         * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미
         *    -> 인스턴스 생성 방법 제한, 초기값 전달 강제회
         * */

        /* 1. 기본 생성자 호출 */
        User user1 = new User();
        System.out.println(user1.getInfomation());

        /* 2. 매개변수 생성자 호출 */
        User user2 = new User("user02", "1234");
        System.out.println(user2.getInfomation());

        User user3 = new User("user03", "12344", "홍길동", new Date());
        System.out.println(user3.getInfomation());

    }
}
