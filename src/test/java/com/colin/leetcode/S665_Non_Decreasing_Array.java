package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S665_Non_Decreasing_Array {

    class Solution {
        public boolean checkPossibility(int[] nums) {
            boolean isChanges = false;
            int max = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                } else {
                    if (isChanges) {
                        return false;
                    } else {
                        isChanges = true;
                    }
                }
            }
            return true;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(true, solution.checkPossibility(new int[]{4, 2, 3}));
        Assert.assertEquals(false, solution.checkPossibility(new int[]{4, 2, 1}));
        Assert.assertEquals(true, solution.checkPossibility(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(false, solution.checkPossibility(new int[]{4, 3, 2, 1}));
//        Assert.assertEquals(false, solution.checkPossibility(new int[]{3, 4, 2, 3}));
    }
}