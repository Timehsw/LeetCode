package com.hsw.Array.easy.LeetCode0119;

import org.junit.Test;

import java.util.List;

/**
 * Created by hushiwei on 2019-02-28.
 * desc :
 */
public class PascalTriangleIITest {
    @Test
    public void testGetRow() {
        PascalTriangleII t   = new PascalTriangleII();
        List<Integer>    row = t.getRow(1);
        for (Integer integer : row) {
            System.out.println(integer);
        }
    }
}
