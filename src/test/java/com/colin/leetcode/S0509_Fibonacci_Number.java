package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0509_Fibonacci_Number {

    class Solution {
//        public int fib(int n) {
//            if (n > 1) {
//                return fib(n - 1) + fib(n - 2);
//            } else if (n == 1) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }

        public int fib(int n) {
            if (n == 0) return 0;
            // fs: fib[n-2]
            // fb: fib[n-2]
            int fs = 0, fb = 1;
            int tmp;
            for (int i = 1; i < n; i++) {
                tmp = fb;
                fb = fs + fb;
                fs = tmp;
            }
            return fb;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(1, solution.fib(2));
        Assert.assertEquals(2, solution.fib(3));
        Assert.assertEquals(3, solution.fib(4));
    }
}