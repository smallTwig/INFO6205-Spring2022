package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode node = new ListNode(0, head);

        ListNode pred = node;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                pred.next = head.next;
            } else {
                pred = pred.next;
            }

            head = head.next;
        }
        return node.next;
    }
}
