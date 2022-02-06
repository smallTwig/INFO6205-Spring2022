package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> freq = new HashMap<>();
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> {
            if(freq.get(a) < freq.get(b)) {
                return -1;
            }else{
                return 1;
            }
        });

        for( int n : freq.keySet() ){
            pq.add(n);
            if( pq.size() > k){
                pq.poll();
            }
        }

        int[] arr = new int[k];
        for ( int i = 0; i < k; i++){
            arr[i] = pq.poll();
        }

        return arr;

    }
}
