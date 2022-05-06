package com.company;
import com.company.Question1;
import com.company.Question2;
import com.company.Question3;
import com.company.Question4;

public class Main {

    public static void main(String[] args) {

        Question1 q1 = new Question1();
        System.out.println(q1.compressString("aabcccccaaa"));
        System.out.println(q1.compressString("ab"));

        Question2 q2 = new Question2();
        char[][] grid = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(q2.numIslands(grid));

        Question3 q3 = new Question3();
        System.out.println(q3.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));


    }

}
