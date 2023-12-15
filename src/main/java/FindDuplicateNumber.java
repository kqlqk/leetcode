package main.java;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{4, 3, 1, 4, 2}));
    }

    public static int findDuplicate(int[] nums) {
        int pointerA = nums[0];
        int pointerB = nums[0];

        do {
            pointerA = nums[pointerA];
            pointerB = nums[nums[pointerB]];
        }
        while (pointerA != pointerB);

        pointerA = nums[0];

        while (pointerA != pointerB) {
            pointerA = nums[pointerA];
            pointerB = nums[pointerB];
        }

        return pointerB;
    }
}
