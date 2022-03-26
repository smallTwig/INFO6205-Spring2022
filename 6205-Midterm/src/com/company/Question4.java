package com.company;

import java.util.*;

import static java.util.Arrays.*;

public class Question4 {

    public int[][] merge(int[][] intervals) {

        sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> list = new LinkedList<>();

        for(int[] interval : intervals){
            if(list.isEmpty() || list.getLast()[1] < interval[0]){
                list.addLast(interval);
            }else{
                list.getLast()[1] = Math.max(list.getLast()[1], interval[1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

