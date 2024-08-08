package com.hitsuni.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {
        /* FileOutputStream 을 이해하고 사용할 수 있다. */

        /* 경로 문제 없이 파일이 존재하지 않을 경우에는 자동으로 파일이 생성 되지만
        * 존재하지 않는 경로가 포함되면 FileNotFoundException 발생.
        * FileOutputStream(파일명, true) -> 이어쓰기, 없으면 덮어쓰기
        *  */
        try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt")) {
            fos.write(97);

            byte[] bytes = new byte[] {98, 99, 100, 101, 102, 10};
            fos.write(bytes);

            fos.write(bytes, 1, 3);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
