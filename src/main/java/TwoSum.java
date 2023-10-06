package main.java;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2,5,5,11}, 10)));
//    }

    //O(n*log(n))
    public int[] twoSum(int[] nums, int target) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);

        int pointer1 = 0;
        int pointer2 = arr.length - 1;
        while (arr[pointer1] + arr[pointer2] != target) {
            if (arr[pointer1] + arr[pointer2] > target) {
                pointer2--;
            }
            else {
                pointer1++;
            }
        }

        int[] res = new int[]{-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (res[0] == -1 && arr[pointer1] == nums[i]) {
                res[0] = i;
            }
            else if (res[1] == -1 && arr[pointer2] == nums[i]) {
                res[1] = i;
            }
        }

        return res;
    }

    // Preferred solution, O(n)
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int n = nums.length;
//
//        // Build the hash table
//        for (int i = 0; i < n; i++) {
//            numMap.put(nums[i], i);
//        }
//
//        // Find the complement
//        for (int i = 0; i < n; i++) {
//            int complement = target - nums[i];
//            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
//                return new int[]{i, numMap.get(complement)};
//            }
//        }
//
//        return new int[]{}; // No solution found
//    }
}
