package com.hitsuni.section03.filterstream;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /* ObjectInputStream/ObjectOutputStream : 객체 단위 입출력 보조 스트림 */

        MemberDTO[] members = {
                new MemberDTO("user01", "pass01", 25, '남', 95.7),
                new MemberDTO("user02", "pass02", 30, '여', 84.2),
                new MemberDTO("user03", "pass03", 35, '여', 72.2),
        };

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"))) {

            for(MemberDTO member : members){
                // MemberDTO 타입 : 객체 하나씩 입력
                oos.writeObject(member);
            }
            // MemberDTO[] 타입 객체를 출력
            // oos.writeObject(members);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        MemberDTO[] inputMembers = new MemberDTO[members.length];

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"))) {
            for(int i = 0; i < inputMembers.length; i++) {
                inputMembers[i] = (MemberDTO)ois.readObject();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            /* 역직렬화 시 해당하는 클래스가 없으면 실패하므로 Exception handling 이 필수이다. */
            throw new RuntimeException(e);
        }

    }
}
