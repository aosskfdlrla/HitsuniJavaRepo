package com.hitsuni.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        int inputSalary = sc.nextInt();

        System.out.print("매출액 입력 : ");
        int inputSales = sc.nextInt();

        if(inputSales >= 50000000) {
            salaryMethod(0.05f, inputSalary, inputSales);
        } else if(inputSales >= 30000000) {
            salaryMethod(0.03f, inputSalary, inputSales);
        } else if(inputSales >= 10000000) {
            salaryMethod(0.01f, inputSalary, inputSales);
        } else {
            salaryMethod(0.00f, inputSalary, inputSales);
        }
    }

    public static void salaryMethod(float bonus, int inputSalary, int inputSales) {
        int bonusSalary = (int)(inputSales * bonus);
        int finSalary = inputSalary + bonusSalary;
        System.out.println("==========================");
        System.out.println("매출액 : " + inputSales);
        System.out.println("보너스율 : " + (int)(bonus * 100) + "%");
        System.out.println("월 급여 : " + inputSalary);
        System.out.println("보너스 금액 : " + bonusSalary);
        System.out.println("==========================");
        System.out.println("총 급여 : " + finSalary);
    }
}
