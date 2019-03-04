package com.hsw.String.easy.LeetCode0013;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-03-04.
 * desc :
 */
public class RomanToIntegerTest {
    @Test
    public void testRomanToInteger() {
        RomanToInteger t = new RomanToInteger();
        Assert.assertEquals(3, t.romanToInt2("III"));
        Assert.assertEquals(4, t.romanToInt2("IV"));
        Assert.assertEquals(9, t.romanToInt2("IX"));
        Assert.assertEquals(58, t.romanToInt2("LVIII"));
        Assert.assertEquals(1994, t.romanToInt2("MCMXCIV"));

        Assert.assertEquals(3, t.romanToInt3("III"));
        Assert.assertEquals(4, t.romanToInt3("IV"));
        Assert.assertEquals(9, t.romanToInt3("IX"));
        Assert.assertEquals(58, t.romanToInt3("LVIII"));
        Assert.assertEquals(1994, t.romanToInt3("MCMXCIV"));
    }
}
