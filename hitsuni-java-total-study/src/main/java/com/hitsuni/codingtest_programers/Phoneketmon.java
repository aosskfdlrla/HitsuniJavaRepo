package com.hitsuni.codingtest_programers;

import java.util.HashMap;

public class Phoneketmon {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1};
        String[] strNums = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strNums[i] = nums[i] + "";
        }

//        System.out.println(strNums[0].hashCode());
//        System.out.println(strNums[1].hashCode());

        int[] nums2 = {3, 3, 3, 2, 2, 2};
        int maxPick = nums2.length / 2;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                hmap.put(nums2[i], nums2[j]);
            }
        }

        System.out.println(hmap.size());
    }
}
