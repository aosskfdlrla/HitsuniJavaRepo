package section02.addtional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

    @Disabled
    @Test
    @Timeout(value=1000, unit = TimeUnit.MILLISECONDS)
    void testTimeOut() {
        try {
            Thread.sleep(1100);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Time Out");
    }

    @Test
    @Order(1)
    void TestFirst() {
        System.out.println("testFirst");
    }

    @Test
    @Order(3)
    void testThird() {
        System.out.println("testThird");
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("testSecond");
    }

    @RepeatedTest(10)
    void reapeatedTest() {
        System.out.println("repeatTest");
    }
}
