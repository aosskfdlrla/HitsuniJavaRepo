package com.hitsuni.level01.basic.student.run;

import com.hitsuni.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int i = 0;
        char keepGoing = 'y';
        StudentDTO[] students = new StudentDTO[10];
        Scanner scan = new Scanner(System.in);

        while(i < 10 && (keepGoing == 'y' || keepGoing == 'Y')) {
            System.out.print("학년 : ");
            int grade = scan.nextInt();

            System.out.print("반 : ");
            int classroom = scan.nextInt();

            scan.nextLine();
            System.out.print("이름 : ");
            String name = scan.nextLine();

            System.out.print("국어점수 : ");
            int kor = scan.nextInt();

            System.out.print("영어점수 : ");
            int eng = scan.nextInt();

            System.out.print("수학점수 : ");
            int math = scan.nextInt();

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
