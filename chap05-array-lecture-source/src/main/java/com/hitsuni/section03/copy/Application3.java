package com.hitsuni.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 배열의 깊은 복사를 이해하고 활용할 수 있다. */

        /* 원본 배열 */
        int[] originArr = {1, 2, 3, 4, 5};

        print(originArr);

        /* for 문 */
        int[] copyArr = new int[10];
        for(int i = 0; i < originArr.length; i++) {
            copyArr[i] = originArr[i];
        }

        print(copyArr);

        /* 2. Object의 clone()
         * 동일한 길이, 동일한 값을 가지는 배열이 생성 되어 복사 */
        int[] copyArr2 = originArr.clone();

        print(copyArr2);

        /* 3. System의 arraycopy() */
        int[] copyArr3 = new int[10];

        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);

        print(copyArr3);

        /* 4. Arrays.copyOf */
        int[] copyArr4 = Arrays.copyOf(originArr, 7);

        print(copyArr4);

        int[] copyArr5 = Arrays.copyOf(originArr, 3);

        print(copyArr5);
    }

    public static void print(int[] arr) {
        System.out.println("arr의 hashCode : " + arr.hashCode());
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
