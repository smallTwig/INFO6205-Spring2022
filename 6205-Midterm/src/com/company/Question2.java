package com.company;

public class Question2 {

        public ListNode addTwoNumber(ListNode l1, ListNode l2){

                ListNode dummy = new ListNode(0);
                ListNode curr = dummy;
                int carry = 0;
                int sum;

                while(l1 != null || l2 != null || carry != 0){

                        sum = 0;
                        sum += carry;

                        if(l1 != null){
                                sum += l1.val;
                                l1 = l1.next;
                        }

                        if(l2 != null){
                                sum += l2.val;
                                l2 = l2.next;
                        }

                        carry = sum/10;
                        curr.next = new ListNode(sum%10);
                        curr = curr.next;

                }
                return dummy.next;

        }
}
