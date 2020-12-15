package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0011_Container_With_Most_Water {

    class Solution {
        public int maxArea(int[] height) {
            int max = 0;

            for (int i = 0; i < height.length; i++) {
                for (int j = 0; j < height.length; j++) {
                    int area = Math.min(height[i], height[j]) * Math.abs(i - j);
                    if (area > max) {
                        max = area;
                    }
                }
            }
            return max;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(1, solution.maxArea(new int[]{1, 1}));
        Assert.assertEquals(16, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
        Assert.assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
        Assert.assertEquals(0, solution.maxArea(new int[]{1}));
        Assert.assertEquals(0, solution.maxArea(new int[]{}));
    }
}