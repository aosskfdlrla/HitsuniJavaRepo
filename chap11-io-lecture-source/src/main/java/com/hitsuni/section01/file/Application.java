package com.hitsuni.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /* File 클래스의 사용 용법을 이해할 수 있다. */

        /* 대상 파일이 존재하지 않아도 인스턴스를 생성 할 수 있다. */
        File file = new File("Test.txt");

        try {
            /* 파일 생성 후 성공 실패 여부 boolean 반환 */
            boolean createSuccess = file.createNewFile();

            /* 최초 실행 시 생성되어 true, 파일이 존재할 경우 새롭게 만들지 않아서 false */
            System.out.println("createSuccess : " + createSuccess);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("file.length() : " + file.length());
        System.out.println("file.getPath() : " + file.getPath()); // 프로젝트 기준으로 상대경로 출력
        System.out.println("file.getParent() : " + file.getParent());
        System.out.println("file.getAbsolutePath() : " + file.getAbsolutePath()); // 파일의 실제 경로인 절대 경로

        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess : " + deleteSuccess);

    }
}
