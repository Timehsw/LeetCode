package com.hsw.Array.easy.LeetCode0001;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-02-18.
 * desc :
 */
public class TwoSumTest {

    @Test
    public void testBruteForceVersion() {
        TwoSum t = new TwoSum();
        Assert.assertArrayEquals(new int[]{1, 4}, t.getTwoNumSumToGivenValueBruteForce(new int[]{1, 2, 3, 6, 8, 11}, 10));
        Assert.assertArrayEquals(new int[]{1, 2}, t.getTwoNumSumToGivenValueBruteForce(new int[]{8, 2, 1, 4}, 3));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueBruteForce(new int[]{8, 2, 1, 4}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueBruteForce(new int[]{}, 0));
    }

    @Test
    public void testHashMapVersion() {
        TwoSum t = new TwoSum();
        Assert.assertArrayEquals(new int[]{1, 4}, t.getTwoNumSumToGivenValueHashMap(new int[]{1, 2, 3, 6, 8, 11}, 10));
        Assert.assertArrayEquals(new int[]{1, 2}, t.getTwoNumSumToGivenValueHashMap(new int[]{8, 2, 1, 4}, 3));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueHashMap(new int[]{8, 2, 1, 4}, 0));
        Assert.assertArrayEquals(new int[]{-1, -1}, t.getTwoNumSumToGivenValueHashMap(new int[]{}, 0));
    }

}
