package main.java;

public class ClimbingStairs {

//    public static void main(String[] args) {
//        System.out.println(new ClimbingStairs().climbStairs(32));
//    }


    public int climbStairs(int n) {
        // Recursive solution O(2^n)
//        if (n < 4) {
//            return n;
//        }
//
//        int a = climbStairs(n - 1, c);
//        int b = climbStairs(n - 2, c);
//
//        return a+b;

        //O(n)
        if (n < 4) {
            return n;
        }

        int n1 = 2;
        int n2 = 3;

        for (int i = 4; i <= n; i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }

        return n2;
    }
}
