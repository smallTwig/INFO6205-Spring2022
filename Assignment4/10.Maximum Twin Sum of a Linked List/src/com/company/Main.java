package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

    }
    public int pairSum(ListNode head) {

        ListNode slow = head, fast = head;
        Deque<Integer> x = new ArrayDeque<>();


        while(slow!=null){
            if(fast==null)
                x.addLast(slow.val);
            slow = slow.next;
            if(fast!=null)
                fast = fast.next.next;
        }

        slow = head;
        int max = Integer.MIN_VALUE;

        while(!x.isEmpty()){
            max = Math.max(max,x.pollLast()+slow.val);
            slow = slow.next;
        }

        return max;
    }
}
