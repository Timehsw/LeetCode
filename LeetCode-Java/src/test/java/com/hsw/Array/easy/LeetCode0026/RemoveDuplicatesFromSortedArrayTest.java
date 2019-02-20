package com.hsw.Array.easy.LeetCode0026;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-02-20.
 * desc :
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArray t = new RemoveDuplicatesFromSortedArray();
        Assert.assertEquals(3, t.removeDuplicates(new int[]{1, 1, 2, 2, 3, 3}));
    }
}
