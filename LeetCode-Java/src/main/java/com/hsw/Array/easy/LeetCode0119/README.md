# 题目描述

给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

在杨辉三角中，每个数是它左上方和右上方的数的和。

示例:

```
输入: 3
输出: [1,3,3,1]
```

进阶：

你可以优化你的算法到 O(k) 空间复杂度吗？

# 题解

下一行只会用到上一行的结果,所以用两个list交换保存即可