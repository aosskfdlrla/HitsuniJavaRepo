package com.hitsuni.level01.basic.student.run;

import com.hitsuni.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        int grade = 0, classroom = 0, kor = 0, eng = 0, math = 0;
        String name = "";
        boolean validResult = false;
        char keepGoing = 'y';
        StudentDTO[] students = new StudentDTO[10];
        Scanner scan = new Scanner(System.in);

        // scan에 있는 함수 사용, hasNextInt 같이 검증해주는 기능 사용
        while(i < 10 && (keepGoing == 'y' || keepGoing == 'Y')) {

            System.out.print("학년 : ");
            if(scan.hasNextInt()) {
                grade = scan.nextInt();
                scan.nextLine(); // 개행문자 제거
            } else {
                System.out.println("학년을 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("반 : ");
            if(scan.hasNextInt()) {
                classroom = scan.nextInt();
                scan.nextLine(); // 개행문자 제거
            } else {
                System.out.println("반을 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("이름 : ");
            if(scan.hasNext()){
                name = scan.nextLine();
                scan.nextLine();
            } else {
                System.out.println("이름을 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("국어점수 : ");
            if(scan.hasNextInt()) {
                kor = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("국어점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("영어점수 : ");
            if(scan.hasNextInt()) {
                eng = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("영어점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("수학점수 : ");
            if(scan.hasNextInt()) {
                math = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("수학점수를 잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.print("계속 추가할 겁니까? (y/n) : ");
            keepGoing = scan.next().charAt(0);

            students[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
            i++;

            if (keepGoing != 'y' && keepGoing != 'Y') {
                students[i] = new StudentDTO(grade, classroom, name, kor, eng, math);
                i++;

                for (int ia = 0; ia < i; ia++) {
                    System.out.println(students[ia].getInfomation());
                }
            }
        }
    }
}
