package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> cmp;
        cmp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        };

        Queue<ListNode> q = new PriorityQueue<ListNode>(cmp);
        for(ListNode l : lists){
            ListNode head = l;
            while(head!=null){
                q.add(head);
                ListNode next = head.next;
                head.next = null;
                head = next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode point = head;
        while(!q.isEmpty()){
            point.next = q.poll();
            point = point.next;
        }
        return head.next;
    }
}
