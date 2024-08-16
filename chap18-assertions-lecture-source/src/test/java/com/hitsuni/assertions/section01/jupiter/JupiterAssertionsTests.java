package com.hitsuni.assertions.section01.jupiter;

import com.hitsuni.assertions.section02.assertj.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/* JUnit5 에서 제공하는  */
public class JupiterAssertionsTests {

    /* 1. assertEquals : 예상 값과 실제 값의 일치 여부를 동일성으로 판단 */
    @Test
    void testAsserEquals() {
        /* given */
        int firstNum = 10;
        int secondNum = 20;
        int expectedNum = 30;

        /* when */
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);

        /* then */
        //Assertions.assertEquals(expectedNum, result);
        //Assertions.assertEquals(expectedNum, result, 1); // - 오차범위
        Assertions.assertNotEquals(expectedNum, result);
    }

    @Test
    @DisplayName("null 인지 테스트")
    void testAssertNull() {
//        String str = null;
//        Assertions.assertNull(str);
        String str = "Hello World";
        Assertions.assertNotNull(str);
    }

    @Test
    @DisplayName("동시에 여러가지 값에 대한 검증을 수행하는 메소드")
    void testAssertAll() {
        String firstName = "길동";
        String lastName = "홍";

        Person person = new Person(firstName, lastName);

        Assertions.assertAll(
                "그룹화 된 테스트의 이름(테스트 실패시 보여지는 부분)",
                ()-> Assertions.assertEquals(firstName, person.getFirstName(), ()-> "firstName이 잘못됨"),
                ()-> Assertions.assertEquals(lastName, person.getLastName(), ()-> "lastName이 잘못됨")
        );
    }

    @Test
    @DisplayName("void 메소드의 경우 exception이 발생하는지 테스트")
    void testAssertThrow() {
        int firstNum = 10;
        int secondNum = 0;

        NumberValidation validation = new NumberValidation();
        Exception exception = Assertions.assertThrows(
          IllegalArgumentException.class,
                () -> validation.checkDivideableNumbers(firstNum, secondNum)
        );

        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(IllegalArgumentException.class, exception, () -> "예외 타입 불일치"),
                () -> Assertions.assertEquals("0으로 나눌 수 없습니다.", exception.getMessage(), ()-> "예외 메시지 불일치")
        );
    }

    @Test
    @DisplayName("Filltering assertions 테스트 하기")
    void testFilteringAssertions() {
        Member member1 = new Member(1, "user01", "유관순", 16);
        Member member2 = new Member(2, "user02", "홍길동", 17);
        Member member3 = new Member(3, "user03", "이순신", 18);
        Member member4 = new Member(4, "user04", "임꺽정", 19);
        Member member5 = new Member(5, "user05", "신사임당", 20);

        List<Member> members = Arrays.asList(member1, member2, member3, member4, member5);

//        Assertions.assertThat(members)
//                .filteredOn(member->member1.getAge() > 20
//                .containsOnly(member3, member4)
//                .filteredOn("age",)
    }
}
