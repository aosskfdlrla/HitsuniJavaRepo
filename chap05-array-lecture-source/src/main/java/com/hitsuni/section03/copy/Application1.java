package com.hitsuni.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /* 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */

        /* 원본 배열 */
        int[] originalArr = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copyArr = originalArr;

        System.out.println("OriginalArr hashCode : " + originalArr.hashCode());
        System.out.println("copyArr hashCode : " + copyArr.hashCode());

        /* 원본 배열과 복사본 배열의 값 출력 */
        for(int i = 0; i < originalArr.length; i++) {
            System.out.print(originalArr[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();
    }
}
