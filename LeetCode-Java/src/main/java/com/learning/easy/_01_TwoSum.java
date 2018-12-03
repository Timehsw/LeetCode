package com.learning.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hushiwei on 2018/3/19.
 * desc :
 * <p>
 * 题目描述 :
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * 给定一个整数数列，找出其中和为特定值的那两个数。
 * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
 * <p>
 * 示例 :
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class _01_TwoSum {

    /**
     * Approach #1 (Brute Force)
     * The brute force approach is simple. Loop through each element x and
     * find if there is another value that equals to target - x.
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * Approach #2 (Two-pass Hash Table)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumApproach2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int[] resArr = new _01_TwoSum().twoSumApproach2(arr, 13);
        for (int i : resArr) {
            System.out.println(i);
        }


    }
}

