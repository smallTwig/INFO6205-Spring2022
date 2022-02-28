package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null){
            return levels;
        }

        find(root,0);
        Collections.reverse(levels);
        return levels;
    }

    public void find(TreeNode node, int level){

        if (levels.size() == level){
            levels.add(new ArrayList<Integer>());
        }

        levels.get(level).add(node.val);

        if (node.left != null){
            find(node.left, level + 1);
        }

        if(node.right != null){
            find(node.right, level +1);
        }

    }
}
