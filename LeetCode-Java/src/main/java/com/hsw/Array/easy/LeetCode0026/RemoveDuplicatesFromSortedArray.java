package com.hsw.Array.easy.LeetCode0026;

/**
 * Created by hushiwei on 2019-02-20.
 * desc : 删除排序数组中的重复项
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int i = new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 1, 1, 1, 2});
        System.out.println(i);
    }
}
