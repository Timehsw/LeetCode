package com.hsw.String.easy.LeetCode0013;

import java.util.HashMap;

/**
 * Created by hushiwei on 2019-03-02.
 * desc : 罗马数字转整数
 */
public class RomanToInteger {
    public int romanToInt(String str) {
        int[] a = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;

        char prev = 'A';
        int  sum  = 0;
        for (char s : str.toCharArray()) {
            if (a[s - 'A'] > a[prev - 'A']) {
                sum = sum - 2 * a[prev - 'A'];
            }
            sum = sum + a[s - 'A'];
            prev = s;
        }
        return sum;
    }

    public int romanToInt2(String str) {
        int pre = 0, cur = 0, result = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'M':
                    cur = 1000;
                    break;
                case 'D':
                    cur = 500;
                    break;
                case 'C':
                    cur = 100;
                    break;
                case 'L':
                    cur = 50;
                    break;
                case 'X':
                    cur = 10;
                    break;
                case 'V':
                    cur = 5;
                    break;
                case 'I':
                    cur = 1;
                    break;
            }
            if (cur > pre) {
                result = result - pre - pre + cur;
            } else {
                result += cur;
            }
            pre = cur;
        }
        return result;
    }

    public int romanToInt3(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int length = s.length();
        Integer result = m.get(s.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
                result += m.get(s.charAt(i));
            } else {
                result -= m.get(s.charAt(i));
            }
        }
        return result;
    }
}
