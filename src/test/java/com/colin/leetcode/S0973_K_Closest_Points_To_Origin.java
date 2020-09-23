package com.colin.leetcode;

import javafx.beans.binding.ObjectExpression;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class S0973_K_Closest_Points_To_Origin {

    class Solution {

        public int[][] kClosest(int[][] points, int K) {
            java.util.SortedMap<Double, List<int[]>> distanceMap = new TreeMap<>();

            for (int[] point : points) {
                double distance = Math.sqrt(Math.pow(point[0], 2)+ Math.pow(point[1], 2));
                List<int[]> distanceList = distanceMap.get(distance);
                if (distanceList == null) {
                    distanceList = new ArrayList<>();
                    distanceMap.put(distance, distanceList);
                }
                distanceList.add(point);
            }

            List<int[]> lRet = new ArrayList<>();

            for (Map.Entry<Double, List<int[]>> entry : distanceMap.entrySet()) {
                if (K <= 0) {
                    break;
                }
                List<int[]> value = entry.getValue();
                K -= value.size();
                lRet.addAll(value);
            }

            return lRet.toArray(new int[0][0]);
        }
    }

    @Test
    public void test() {
        Solution solution = new Solution();
        Object result = null;

//        result = solution.kClosest(new int[][] {{1,3}, {-2,2}}, 1);
//        System.out.println(result);

        result = solution.kClosest(new int[][] {{-2,2},{2,-2},{1,3}}, 2);
        System.out.println(result);
    }
}