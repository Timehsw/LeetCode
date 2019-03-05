package com.hsw.String.easy.LeetCode0014;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-03-05.
 * desc :
 */
public class LongestCommomPrefixTest {
    @Test
    public void testLongestCommomPrefix() {
        LongestCommomPrefix t = new LongestCommomPrefix();
        Assert.assertEquals("fl", t.longestCommomPrefix(new String[]{"flower", "flow", "flight"}));

    }
}
