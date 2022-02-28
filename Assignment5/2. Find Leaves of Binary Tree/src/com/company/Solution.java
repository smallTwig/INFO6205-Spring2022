package com.company;

import com.company.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> solution = new ArrayList<List<Integer>>();

    public List<List<Integer>> findLeaves(TreeNode root) {

        getHeight(root);

        return solution;

    }

    private int getHeight(TreeNode root){

        if (root == null){
            return -1;
        }

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int currHeight = Math.max(leftHeight,rightHeight) + 1;

        if (solution.size() == currHeight){
            solution.add(new ArrayList<>());
        }

        solution.get(currHeight).add(root.val);

        return currHeight;
    }
}
