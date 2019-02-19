package com.hsw.Array.easy.LeetCode0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hushiwei on 2019-02-18.
 * desc :
 */
public class TwoSum {

    // Time: O(n^2), Space: O(1)
    public int[] getTwoNumSumToGivenValueBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // Time: O(n), Space: O(n)
    public int[] getTwoNumSumToGivenValueHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int numNeeded = target - nums[i];
            if (map.containsKey(numNeeded)) {
                return new int[]{map.get(numNeeded), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
