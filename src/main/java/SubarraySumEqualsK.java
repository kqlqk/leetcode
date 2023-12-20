package main.java;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1,1,1}, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        int result = 0;
        int temp;

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            if (temp == k) {
                result++;
            }

            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                if (temp == k) {
                    result++;
                }
            }
        }

        return result;
    }
}
