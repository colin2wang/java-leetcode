package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0004_Median_Of_Two_Sorted_Arrays {

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int totalLength = m + n;
            boolean isEven = (totalLength % 2 == 0);
            int halfLength = totalLength / 2;

            int i = 0, j = 0;
            int a = 0, b = 0;

            // 线性扫描，找到中位数的位置
            for (int k = 0; k <= halfLength; k++) {
                b = a;

                if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                    a = nums1[i++];
                } else if (j < n) {
                    a = nums2[j++];
                }
            }

            // 根据总长度的奇偶性计算中位数
            if (isEven) {
                return (a + b) / 2.0;
            } else {
                return a;
            }
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertEquals(4.5, solution.findMedianSortedArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}), 0.001);
        Assert.assertEquals(3.0, solution.findMedianSortedArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}), 0.001);
        Assert.assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 99}, new int[]{2, 3}), 0.001);
        Assert.assertEquals(2.0, solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.001);
        Assert.assertEquals(4.0, solution.findMedianSortedArrays(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6}), 0.001);
        Assert.assertEquals(3.0, solution.findMedianSortedArrays(new int[]{1, 5, 99}, new int[]{2, 3}), 0.001);
    }
}