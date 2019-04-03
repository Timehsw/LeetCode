package com.hsw.BFS.LeetCode0107;

import com.hsw.DataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hushiwei on 2019-04-03.
 * desc :
 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderTraversalFromBottom(TreeNode root){
        if (root==null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> elem = new ArrayList<>();
            int size=q.size();
            for (int i=0;i<size;i++){
                TreeNode s = q.poll();
                elem.add(s.val);
                if (s.left!=null) q.add(s.left);
                if (s.right!=null) q.add(s.right);
            }
            result.add(elem);
        }

        for (int i = 0; i < result.size() / 2; ++i) {
            int j = result.size() - 1 - i;
            List<Integer> tmp = result.get(j);
            result.set(j, result.get(i));
            result.set(i, tmp);
        }
        return result;
    }

}
