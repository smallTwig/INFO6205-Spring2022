package com.company;

import java.util.HashMap;

public class Question3 {

    public int[] binaryTree(int[] preOrder, int[] inOrder){

        int root = preOrder[0];
        int index;
        for(int i = 0; i < inOrder.length; i++){
            if(inOrder[i] == root){
                index = i;
            }
        }

        HashMap<Integer,Integer> pair = new HashMap<Integer, Integer>();


    }
}
