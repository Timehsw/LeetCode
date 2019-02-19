package com.hsw.Array.easy;

/**
 * Created by hushiwei on 2018/3/19.
 * desc :
 * <p>
 * 题目描述 :
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 给定一个范围为 32 位 int 的整数，将其颠倒。
 * <p>
 * Note:
 * Assume we are dealing with an environment which could only hold integers within
 * the 32-bit signed integer range. For the purpose of this problem, assume that your
 * function returns 0 when the reversed integer overflows.
 * <p>
 * 示例:
 * Example 1:
 * Input: 123
 * Output:  321
 * <p>
 * Example 2:
 * Input: -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: 120
 * Output: 21
 */
public class _07_ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail      = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;

    }

    public static void main(String[] args) {
        int num = 123;
        int res = new _07_ReverseInteger().reverse(num);
        System.out.println(res);
    }
}
