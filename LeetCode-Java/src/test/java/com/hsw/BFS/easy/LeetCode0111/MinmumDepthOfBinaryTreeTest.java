package com.hsw.BFS.easy.LeetCode0111;

import com.hsw.DataStructures.Helper;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-04-01.
 * desc :
 */
public class MinmumDepthOfBinaryTreeTest {
    /*
    Tree 1:
     null
    Tree 2:
      1
    Tree 3:
      1
     /
    2
    Tree 4:
       1
     /   \
    2     4
         / \
        8  16
     */
    @Test
    public void testRecursiveVersion() {
        MinmumDepthOfBinaryTree m = new MinmumDepthOfBinaryTree();
        Assert.assertEquals(0, m.minDepth(null));
        Assert.assertEquals(1, m.minDepth(Helper.buildTree(1)));
        Assert.assertEquals(2, m.minDepth(Helper.buildTree(1, 2, null)));
        Assert.assertEquals(2, m.minDepth(Helper.buildTree(1, 2, 4, null, null, 8, 16)));
    }

    @Test
    public void testIterativeVersion() {
        MinmumDepthOfBinaryTree m = new MinmumDepthOfBinaryTree();
        Assert.assertEquals(0, m.minDepthIterative(null));
        Assert.assertEquals(1, m.minDepthIterative(Helper.buildTree(1)));
        Assert.assertEquals(2, m.minDepthIterative(Helper.buildTree(1, 2, null)));
        Assert.assertEquals(2, m.minDepthIterative(Helper.buildTree(1, 2, 4, null, null, 8, 16)));
    }
}
