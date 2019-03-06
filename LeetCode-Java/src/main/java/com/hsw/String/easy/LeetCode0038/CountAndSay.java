package com.hsw.String.easy.LeetCode0038;

/**
 * Created by hushiwei on 2019-03-06.
 * desc :
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String s = "1";
        int    k;
        for (int i = 1; i < n; i++) {
            StringBuilder t = new StringBuilder();
            for (int j = 0; j < s.length(); j = k) {
                k = j;
                //找有几个相同
                while (k < s.length() && s.charAt(k) == s.charAt(j)) {
                    k++;
                }
                t.append(k - j).append(s.charAt(j));
            }
            s = t.toString();
        }
        return s;
    }
}
