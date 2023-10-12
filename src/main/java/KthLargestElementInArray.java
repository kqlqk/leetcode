package main.java;

import java.util.*;

public class KthLargestElementInArray {

//    public static void main(String[] args) {
//        System.out.println(new KthLargestElementInArray().findKthLargest(new int[]{2, 1, 1}, 2));
//        System.out.println(new KthLargestElementInArray().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
//    }

    //the fastest way without sorting
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        return minHeap.peek();
    }

    //without sorting
    public int findKthLargest22(int[] nums, int k) {
        int curr = Integer.MIN_VALUE;
        int count = 0;

        while (count != k) {
            int index = -1;
            curr = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > curr) {
                    curr = nums[i];
                    index = i;
                }
            }

            if (index != -1) {
                nums[index] = Integer.MIN_VALUE;
                count++;
            }
        }

        return curr;
    }

    // with sorting
    public int findKthLargest222(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
