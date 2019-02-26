package com.hsw.Array.easy.LeetCode0118;

import org.junit.Test;

import java.util.List;

/**
 * Created by hushiwei on 2019-02-26.
 * desc :
 */
public class PascalTriangleTest {
    @Test
    public void testGenerate() {

        PascalTriangle t = new PascalTriangle();
        List<List<Integer>> generate = t.generate(5);
        for (List<Integer> integers : generate) {
            for (Integer integer : integers) {
                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }
}
