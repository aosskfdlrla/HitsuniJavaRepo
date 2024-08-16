package com.hitsuni.chap01.section01.timecomplexity;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 15, 4, 9, 10, 7};
        System.out.println(getFirst(arr));
        System.out.println(binarySearch(arr, 15));
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Fibonacci(5));
    }

    /* 1. 상수 시간 O(1)
    * 입력의 크기와 상관 없이 연산하는 경우 - 입력 값과 상관 없이 동작
    * arr[0] + arr[1] 했다고 해서 O(2) 굳이 상수 시간을 더 표기하지는 않음
    * */
    private static int getFirst(int[] arr) { return arr[0]; }

    /* 2. 선형 시간 O(n)
    * 입력된 크기에 따른 연산을 하는 경우 - 예를 들어 배열의 크기 10일 때 선형 시간 10
    * 배열을 순회하면서 값을 확인하거나 여러가지 연산을 하는데 걸리는 시간.
    * (ex : 단순 1중 반복문)
    * 최선의 경우 O(1) : 찾고자 하는 요소가 처음에 있을 경우
    * 최악의 경우 O(n) : 찾고자 하는 요소가 맨 나중에 있을 뎡우
    *
    * 단점 : 배열의 크기가 커질 수록 검색에 시간이 걸리게 됨.
    * */
    private static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            reversed[i] = arr[arr.length - 1 - i];

        return reversed;
    }

    /* 3. 로그시간(log n)
    * 배열의 중간 요소를 선택하여 찾고자 하는 요소와 비교한 후
    * 중간 요소보다 작으면 왼쪽 반쪽을 크면 오른쪽을 반쪽을 검색한다.
    * 최선의 경우 O(1) : 찾고자 하는 요소가 처음에 있는 경우
    * 최악의 경우 O(log n) : 찾고자 하는 요소가 마지막에 있는 경우
    *(ex - 이진 검색 (Binary Search))
    *
    * 단점 : 배열이 정렬 되어있어야 한다.
    * */
    private static int binarySearch(int[] arr, int target) {
        /* 초기 세팅 (배열을 오름차순으로 정렬하고 시작한다. */
        Arrays.sort(arr); // 내부적으로 nlog n 만큼의 시간이 걸리지만 지금은 고려 X

        /* 배열의 처음과 끝을 지정하는 위치(인덱스)를 담은 변수 (포인터) */
        int left = 0, right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(target == arr[mid])
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    /* 4. 지수 시간 O(2^n)
    * 입력한 크기에 따라서 연산 시간이 배로 늘어나는 알고리즘 형태
    * 즉, 입력데이터가 증가할 떄마다 시간이 2배로 늘어나는 경우
    * (ex - 재귀함수, 피보나치 수열 등)
    *  */
    public static int Fibonacci(int n) {
        if (n <= 1) return n;
        return Fibonacci (n - 1) + Fibonacci (n - 2);
    }


}
