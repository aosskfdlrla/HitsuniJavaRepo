package com.hitsuni.assertions.section02.assertj;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class AssertJTest {
    /* 1. 문자열 테스트 */
    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation() {
        // given
        String expected = "Hello World";

        // when
        String actual = new String(expected);

        // than
        Assertions.assertThat(actual)
                  .isNotEmpty()
                  .isNotBlank()
                  .contains("Hello")
                  .doesNotContain("world")
                  .startsWith("h")
                  .endsWith("l")
                  .isEqualTo(expected);
    }

    /* 2. 숫자 테스트 */
    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation() {
        double pi = Math.PI;

        Double actual = Double.valueOf(pi);

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthDay = "2014-09-18T16:42:00.000";

        LocalDateTime theDay = LocalDateTime.parse(birthDay);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasMonth(Month.SEPTEMBER)
                .hasDayOfMonth(18)
                .isBetween("","")
                .isBefore(LocalDateTime.now())
    }

    /* 4. 예외 테스트 하기 */
    @Test
    @DisplayName("예외 테스트 하기")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(()->{
            throw new IllegalArgumentException("잘못 된 파라미터를 입력하였습니다.");
        });

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터");
    }
}
