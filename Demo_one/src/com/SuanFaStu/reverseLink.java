package com.SuanFaStu;

import javax.management.ListenerNotFoundException;

public class reverseLink {
    static ListNode reverseLinked(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        //ListNode temp = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
