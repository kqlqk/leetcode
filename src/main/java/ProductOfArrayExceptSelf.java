package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1,2,3,4})));
    }


    /*
    Input: nums = [1,2,3,4]
          Output: [24,12,8,6]


     */
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] lefts = new int[nums.length];
        int[] rights = new int[nums.length];
        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            lefts[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            rights[i] = right;
            right *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = lefts[i] * rights[i];
        }

        return res;
    }
}
