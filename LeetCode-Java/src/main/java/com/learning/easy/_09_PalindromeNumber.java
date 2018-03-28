package com.learning.easy;

/**
 * Created by hushiwei on 2018/3/21.
 * desc :
 * <p>
 * 题目描述 :
 * Determine whether an integer is a palindrome. Do this without extra space.
 * <p>
 * 判断一个整数是否是回文数。不能使用辅助空间。
 * <p>
 * Some hints:
 * Could negative integers be palindromes? (ie, -1)
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 * There is a more generic way of solving this problem.
 * <p>
 * 一些提示:
 * <p>
 * 负整数可以是回文数吗？（例如 -1）
 * 如果你打算把整数转为字符串，请注意不允许使用辅助空间的限制。
 * 你也可以考虑将数字颠倒。但是如果你已经解决了 “颠倒整数” 问题的话，就会注意到颠倒整数时可能会发生溢出。你怎么来解决这个问题呢？
 * 本题有一种比较通用的解决方式。
 * <p>
 * <p>
 * <p>
 * 不能使用额外的内存空间,那么意味着不能使用字符串了
 * <p>
 * <p>
 * 那么一个很显然的想法就是把数字从中划开,然后把第二部分反转,接着跟第一部分比较.如果相同,那么就是回文数了.
 */
public class _09_PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        int     x          = 1233221;
        boolean palindrome = new _09_PalindromeNumber().isPalindrome(x);
        if (palindrome) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }

    }


}
