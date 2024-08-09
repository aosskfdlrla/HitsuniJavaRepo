package com.hitsuni.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /* DataInputStream/OutputStream : 데이터 입출력 보조 스트림
        * 영구적으로 저장된 데이터를 읽어오는 것에 목적이 좀 더 크다.
        * */

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt"))) {
            dos.writeUTF("안녕하세요!");
            dos.writeInt(95);
            dos.writeChar('A');

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"))) {
            /* 파일에 기록한 순서 대로 읽어오지 않는 경우 에러가 발생하서나 의미 없는 데이터를 읽어오게 된다. */
            while(true) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }

            /* read자료형() 메소드는 파일에서 더 이상 읽어올 값이 없는 경우 EOFException(End Of FIle) 발생 */
        } catch (EOFException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
