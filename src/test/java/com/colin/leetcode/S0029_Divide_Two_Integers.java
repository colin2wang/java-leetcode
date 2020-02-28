package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0029_Divide_Two_Integers {

    class Solution {
        public int divide(int dividend, int divisor) {
            if (divisor == 1) {
                return dividend;
            }
            double dividendDou = (double) dividend;
            double divisorDou = (double) divisor;
            double logAns = Math.log(Math.abs(dividendDou)) - Math.log(Math.abs(divisorDou));
            double answer = Math.exp(logAns);
            if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
                answer = -answer;
            }
            return (int) answer;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(-2147483648, solution.divide(-2147483648, 1));
        Assert.assertEquals(2147483647, solution.divide(-2147483648, -1));
        Assert.assertEquals(3, solution.divide(10, 3));
        Assert.assertEquals(-2, solution.divide(7, -3));
    }
}