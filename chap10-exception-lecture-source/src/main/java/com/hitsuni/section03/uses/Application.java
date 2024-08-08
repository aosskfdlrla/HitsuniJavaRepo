package com.hitsuni.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* 예외 처리를 많이 사용하는 io 패키지에서 예외 처리를 사용하는 구문을 이해할 수 있다. */

        /* 아직 IO는 학습하지 않았음으로 IO의 문법보다 try-catch 블럭의 실제 사용과 흐름에 집중한다.
        *  */
        BufferedReader br = null;
        try {
            /* FileReader 생성자에 throws FileNotFoundException 있으므로
            * 호출해서 사용하는 쪽에서는 예외처리가 필수이다. -> try-catch 블럭 처리
            * */
            br = new BufferedReader(new FileReader("test.txt"));
            String s;

            while((s = br.readLine()) != null) {
                System.out.println(s);
            }

            /* IOException은 입출력에 관해 추상화 된 예외 클래스로
            * FileNotFoundException 도 IOException의 후손이다.
            * */
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
