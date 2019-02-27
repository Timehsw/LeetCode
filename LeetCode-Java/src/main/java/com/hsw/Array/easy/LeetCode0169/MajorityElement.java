package com.hsw.Array.easy.LeetCode0169;

import java.util.HashMap;

/**
 * Created by hushiwei on 2019-02-27.
 * desc : 求众数
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int cnt = 0; // 计数
        int ret = 0; // 返回值

        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                ret = nums[i];
            }
            if (nums[i] != ret) {
                cnt -= 1;
            } else {
                cnt += 1;
            }
        }

        return ret;
    }

    public int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int max = 0;
        int res = 0;
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (max < value) {
                max = value;
                res = key;
            }
        }
        return res;
    }
}
