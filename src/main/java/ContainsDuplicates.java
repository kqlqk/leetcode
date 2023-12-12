package main.java;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        Set<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            boolean distinct = numsSet.add(num);

            if (!distinct) {
                return true;
            }
        }

        return false;
    }
}
