package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class S007_Reverse_Integer {

    class Solution {
        public int reverse(int x) {
            long res = 0;
            while (x != 0) {
                res = res * 10 + x % 10;
                x /= 10;
            }
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
            return (int)res;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(321, solution.reverse(123));
        Assert.assertEquals(981, solution.reverse(1890));
        Assert.assertEquals(-321, solution.reverse(-123));
        Assert.assertEquals(0, solution.reverse(1534236469));
    }
}