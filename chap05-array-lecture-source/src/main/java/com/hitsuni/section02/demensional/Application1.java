package com.hitsuni.section02.demensional;

public class Application1 {
    public static void main(String[] args) {
        /* 디치원 배열의 구조를 이해하고 사용할 수 있다. */

        /* 1. 배열의 주소를 보관할 레퍼런스 변수 선언 (stack) */
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /* 2. 여러 개의 1차원 배열의 주소를 관리하는 배열 생성 (heap) */
        //iarr1 = new int[][]; // -> 크기가 지정되지 않아 에러
        //iarr1 = new int[][4]; // -> 앞부분의 배열을 먼저 선언하지 않으면 2차원 배열은 선언할 수 없음!
        iarr1 = new int[3][];

        /* 3. 주소를 관리하는 배열의 인덱스마다 배열을 할당 (heap) */
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

        /* 2,3 번의 과정을 한번에 처리할 수 있다. */
        iarr2 = new int[3][5];

        /* 4. 각 배열의 인덱스에 차례로 접근해서 값 출력 */
        for(int i = 0; i < iarr1[0].length; i++) {
            System.out.print(iarr1[0][i] + " ");
        }
        System.out.println();

        for(int i = 0; i < iarr1[1].length; i++) {
            System.out.print(iarr1[1][i] + " ");
        }
        System.out.println();

        for(int i = 0; i < iarr1[2].length; i++) {
            System.out.print(iarr1[2][i] + " ");
        }
        System.out.println();
        System.out.println();

        /* 이중 for 문으로 2차원 배열 인덱스 접근 */
        for(int i = 0; i < iarr2.length; i++) {
            for(int j = 0; j < iarr2.length; j++) {
                System.out.print(iarr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
