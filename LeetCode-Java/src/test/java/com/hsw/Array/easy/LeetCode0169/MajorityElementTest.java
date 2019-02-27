package com.hsw.Array.easy.LeetCode0169;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-02-27.
 * desc :
 */
public class MajorityElementTest {
    @Test
    public void testMajorityElement() {
        MajorityElement t = new MajorityElement();
        Assert.assertEquals(3, t.majorityElement(new int[]{3, 2, 3}));
        Assert.assertEquals(2, t.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        Assert.assertEquals(3, t.majorityElement2(new int[]{3, 2, 3}));
        Assert.assertEquals(2, t.majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
