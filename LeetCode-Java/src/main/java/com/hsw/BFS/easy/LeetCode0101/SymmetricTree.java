package com.hsw.BFS.easy.LeetCode0101;

import com.hsw.DataStructures.TreeNode;

import java.util.Stack;

/**
 * Created by hushiwei on 2019-04-03.
 * desc : 判断二叉树是否对称
 */
public class SymmetricTree {

    boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s != null && t != null)
            return s.val == t.val && isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
        else return s == null && t == null;
    }

    /**
     * 递归方法
     *
     * @param root
     * @return
     */
    public boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    /**
     * 迭代方法
     *
     * @param root
     * @return
     */
    public boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.isEmpty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;

            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);

        }
        return true;
    }
}
