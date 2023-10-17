package main.java;

import java.util.*;

public class PerfectSquares {

    public static void main(String[] args) {
        System.out.println(new PerfectSquares().numSquares(12));
    }

    public int numSquares(int n) {
        if (((int) Math.sqrt(n)) * ((int) Math.sqrt(n)) == n) {
            return 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visit = new HashSet<>();
        int count = 0;

        queue.add(n);

        while (!queue.isEmpty()) {
            count++;

            int size = queue.size();
            for (int j = 1; j <= size; j++) {
                int value = queue.poll();
                int div = (int) Math.sqrt(value);

                for (int i = 1; i <= div; i++) {
                    if ((value - i * i) == 0) {
                        return count;
                    }

                    else if (visit.add(value - i * i)) {
                        queue.add(value - i * i);
                    }
                }
            }

        }

        return count;
    }
}
