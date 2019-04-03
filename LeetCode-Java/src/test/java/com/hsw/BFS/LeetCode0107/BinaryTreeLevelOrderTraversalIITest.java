package com.hsw.BFS.LeetCode0107;

import com.hsw.DataStructures.Helper;
import org.junit.Test;

/**
 * Created by hushiwei on 2019-04-03.
 * desc :
 */
public class BinaryTreeLevelOrderTraversalIITest {
    /*
Tree 1: true
  null

Tree 2: true
   1

Tree 3: true
   1
 /   \
2     4
     / \
    8  16

 */
    @Test
    public void test() {
        BinaryTreeLevelOrderTraversalII b = new BinaryTreeLevelOrderTraversalII();
        Helper.assertListListEquals(
                Helper.buildList(),
                b.levelOrderTraversalFromBottom(null)
        );
        Helper.assertListListEquals(
                Helper.buildList(Helper.buildList(1)),
                b.levelOrderTraversalFromBottom(Helper.buildTree(1))
        );
        Helper.assertListListEquals(
                Helper.buildList(Helper.buildList(8, 16), Helper.buildList(2, 4), Helper.buildList(1)),
                b.levelOrderTraversalFromBottom(Helper.buildTree(1, 2, 4, null, null, 8, 16))
        );
    }

}
