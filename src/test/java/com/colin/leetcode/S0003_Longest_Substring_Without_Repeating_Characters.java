package com.colin.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class S0003_Longest_Substring_Without_Repeating_Characters {

    class Solution {
        public int lengthOfLongestSubstring(String s) {

            char chars[] = s.toCharArray();

            switch (chars.length) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                default:
                    return forward(chars);
            }
        }

        protected int forward(char[] chars) {
            int count = 0;
            int max = 0;

            for (int start = 0; start < chars.length; start++) {
                int[] charArray = new int[128];
                for (int idx = start; idx < chars.length; idx++) {
                    char ch = chars[idx];
                    if (charArray[ch] == 1) {
                        if (count > max) {
                            max = count;
                        }
                        count = 1;
                    } else {
                        charArray[ch] = 1;
                        count++;
                    }
                }
                max = Math.max(count, max);
                count = 0;
            }

            return max;
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();

        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring(" "));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        Assert.assertEquals(6, solution.lengthOfLongestSubstring("asjrgapa"));
    }
}