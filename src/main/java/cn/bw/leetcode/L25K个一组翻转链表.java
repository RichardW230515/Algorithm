package cn.bw.leetcode;

import cn.bw.leetcode.common.ListNode;

public class L25K个一组翻转链表 {

    public ListNode reverseKGroup(ListNode head, int k) {

        if(head==null||head.next==null)return head;
        ListNode tail=head;
        for(int i=0;i<k;i++){
            if(tail==null)return head;

            tail = tail.next;
        }

        ListNode newHead = reverse(head,tail);

        head.next = reverseKGroup(tail,k);
        return newHead;
    }

    public ListNode reverse(ListNode head, ListNode tail){
        ListNode pre = null, next=null;
        //notice :  head !=tail
        while (head!=tail){
            next = head.next;
            head.next = pre;

            pre = head;
            head = next;
        }

        return pre;
    }

}
