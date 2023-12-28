package main.java;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{0,2,2,1,1}));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        if (nums[nums.length - 1] < 1) {
            return 1;
        }

        int i = 0;
        boolean checked = false;

        while (i < nums.length) {
            if (nums[i] > 0) {
                if (!checked && 1 < nums[i]) {
                    return 1;
                }
                checked = true;

                if (i < nums.length - 1 &&  nums[i] + 1 != nums[i + 1] && nums[i] != nums[i + 1]) {
                    return nums[i] + 1;
                }
            }

            i++;
        }

        return nums[nums.length - 1] + 1;
    }
}
