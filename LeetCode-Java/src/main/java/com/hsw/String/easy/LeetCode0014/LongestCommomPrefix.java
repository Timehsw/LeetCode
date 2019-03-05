package com.hsw.String.easy.LeetCode0014;

/**
 * Created by hushiwei on 2019-03-05.
 * desc : 最长公共前缀
 */
public class LongestCommomPrefix {
    /**
     * 水平扫描法
     * 将第一个元素作为前缀,依次去与后续的元素进行比较,截取即可
     * @param strs
     * @return
     */
    public String longestCommomPrefix(String[] strs) {
        if (strs.length==0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
