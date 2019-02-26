package com.hsw.Array.easy.LeetCode0118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hushiwei on 2019-02-26.
 * desc : 杨辉三角
 * Note : 其实也没有什么难的,这就是用一个二维数组进行存储.所以填充每一行的结果就new一个就行
 * 第一行为1
 * 剩下的,第一个元素为1,最后一个元素为1.中间的元素j都是对应上一行的j-1个元素加上第j个元素的结果.即可
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            ArrayList<Integer> row     = new ArrayList<>();
            List<Integer>      prevRow = triangle.get(rowNum - 1);

            // the first element is always 1
            row.add(1);
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // the last element is also 1
            row.add(1);
            triangle.add(row);
        }
        return triangle;

    }
}
