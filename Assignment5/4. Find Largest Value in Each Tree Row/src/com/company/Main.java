package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

    }

    public List<Integer> largestValues(TreeNode root) {

            List<Integer> ans = new ArrayList();
            int max = Integer.MIN_VALUE;

            if (root == null){
                return ans;
            }

            Queue<TreeNode> q = new LinkedList();
            q.add(root);

            while(!q.isEmpty()){

                int n = q.size();
                for (int i = 0; i < n; i++){

                    TreeNode temp = q.poll();
                    max= Math.max(max,temp.val);

                    if (temp.left != null){
                        q.add(temp.left);
                    }
                    if (temp.right != null){
                        q.add(temp.right);
                    }
                }

                ans.add(max);
                max=Integer.MIN_VALUE;
            }

            return ans;
    }
}
