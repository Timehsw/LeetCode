package com.hsw.BFS.LeetCode101;

import com.hsw.BFS.LeetCode0101.SymmetricTree;
import com.hsw.DataStructures.Helper;
import com.hsw.DataStructures.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-04-03.
 * desc :
 */
public class SymmetricTreeTest {
    /*
 tree1:

      1
    /   \
   2     2
  / \   / \
 4   8 8   4

 tree2:

      1
    /   \
   2     2
  / \   /
 4   8 8

 */
    @Test
    public void testRecursiveVersion() {
        SymmetricTree s     = new SymmetricTree();
        TreeNode      tree1 = Helper.buildTree(1, 2, 2, 4, 8, 8, 4);
        TreeNode      tree2 = Helper.buildTree(1, 2, 2, 4, 8, 8, null);
        Assert.assertEquals(true, s.isSymmetricTreeRecursive(tree1));
        Assert.assertEquals(false, s.isSymmetricTreeRecursive(tree2));
    }

    @Test
    public void testIterativeVersion() {
        SymmetricTree s     = new SymmetricTree();
        TreeNode      tree1 = Helper.buildTree(1, 2, 2, 4, 8, 8, 4);
        TreeNode      tree2 = Helper.buildTree(1, 2, 2, 4, 8, 8, null);
        Assert.assertEquals(true, s.isSymmetricTreeIterative(tree1));
        Assert.assertEquals(false, s.isSymmetricTreeIterative(tree2));
    }
}
