package com.hsw.Array.easy.LeetCode0119;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hushiwei on 2019-02-28.
 * desc : 杨辉三角2 ,返回第K行
 * Note : 计算当前层的数只需要有上一层的结果就好,所以用两个数组/list不停交换即可
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> last = new ArrayList<>();
        last.add(1);
        if (rowIndex == 0) {
            return last;
        }
        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                tmp.add(last.get(j - 1) + last.get(j));
            }
            tmp.add(1);
            last = tmp;
        }
        return last;
    }
}
