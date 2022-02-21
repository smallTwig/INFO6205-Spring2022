package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }
    public int numComponents(ListNode head, int[] nums) {

        HashSet<Integer> set= new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int count = 0;
        int noe = 0;

        while(head != null && set.size() > 0){

            if(set.contains(head.val)){
                set.remove(head.val);
                noe++;
            }else{
                if(noe > 0){
                    count++;
                    noe = 0;
                }
            }
            head = head.next;
        }

        if(noe != 0){
            count++;
        }

        return count;
    }
}
