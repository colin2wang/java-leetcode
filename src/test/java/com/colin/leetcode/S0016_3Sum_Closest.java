package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0016_3Sum_Closest {

    class Solution {
        public int threeSumClosest(int[] nums, int target) {

            int minValue = Integer.MAX_VALUE;
            int minDistance = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    for (int k = 0; k < nums.length; k++) {
                        if (i < j && j < k) {
                            int sum = nums[i] + nums[j] + nums[k];
                            int distance = Math.abs(target - sum);
                            if (minDistance > distance) {
                                minDistance = distance;
                                minValue = sum;
                            }
                        }
                    }
                }
            }

            return minValue;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        Assert.assertEquals(2, solution.threeSumClosest(new int[]{1, 1, 1, 0}, -100));
        Assert.assertEquals(3, solution.threeSumClosest(new int[]{1, 1, 1, 0}, 100));
    }
}