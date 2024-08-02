package com.hitsuni.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        /* 하나의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간을 찾아갈 인덱스가 있다. */
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /* 인덱스를 반복문으로 처리할 수 있다.
         * 향상된 for 문 과의 차이점은 배열에 값을 할당하고 있으므로
         * 향상된 for 문은 사용할 수 없다. */
        for(int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        int sum = 0;

        /* 향상된 for 문
         * for(한번의 반복문에서 사용 될 변수 : 반복을 수행할 배열)
         * 배열의 값을 참조할 때만 사용이 가능하며 j 로 값을 담더라도 배열의 값에는
         * 변화가 없음. -> 배열의 값을 참조할 수 있으나 변경할 수 없음.*/
        for (int j : arr) {
            System.out.println("j = " + j);
            sum += j;
        }

        System.out.println("sum = " + sum);
    }
}
