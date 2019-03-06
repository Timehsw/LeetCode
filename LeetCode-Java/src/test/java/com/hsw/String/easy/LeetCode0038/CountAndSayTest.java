package com.hsw.String.easy.LeetCode0038;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-03-06.
 * desc :
 */
public class CountAndSayTest {
    @Test
    public void testCountAndSay() {
        CountAndSay t = new CountAndSay();
        Assert.assertEquals("1", t.countAndSay(1));
        Assert.assertEquals("1211", t.countAndSay(4));
    }
}
