package com.hsw.BFS.medium.LeetCode0102;

import com.hsw.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hushiwei on 2019-04-03.
 * desc : 二叉树的层序遍历
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode>     q      = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            ArrayList<Integer> row  = new ArrayList<>();
            int                size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode s = q.poll();
                row.add(s.val);
                if (s.left != null) q.add(s.left);
                if (s.right != null) q.add(s.right);
            }
            result.add(row);
        }
        return result;

    }

}
