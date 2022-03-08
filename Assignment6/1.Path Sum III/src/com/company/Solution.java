package com.company;

import java.util.HashMap;

public class Solution {
    int count = 0;
    int k;
    HashMap<Integer, Integer> h = new HashMap();

    public void preorder(TreeNode node, int currSum) {
        if (node == null)
            return;

        currSum += node.val;

        if (currSum == k)
            count++;

        count += h.getOrDefault(currSum - k, 0);

        h.put(currSum, h.getOrDefault(currSum, 0) + 1);
        preorder(node.left, currSum);
        preorder(node.right, currSum);
        h.put(currSum, h.get(currSum) - 1);
    }

    public int pathSum(TreeNode root, int sum) {
        k = sum;
        preorder(root, 0);
        return count;
    }
}
