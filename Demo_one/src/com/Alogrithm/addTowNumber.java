//package com.Alogrithm;
//
//public class addTowNumber {
//    public static ListNode addTwoNumber(ListNode l1,ListNode l2){
//        ListNode pre = new ListNode(0);
//        ListNode cur = pre;
//        int carry = 0;
//        while(l1 != null || l2 != null){
//            int x = (l1 == null)?0:l1.val;
//            int y = (l2 == null)?0:l2.val;
//            int sum = x + y + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//            cur.next = new ListNode(sum);
//            cur = cur.next;
//            if(l1!=null){
//                l1 = l1.next;
//            }
//            if(l2 != null){
//                l2 = l2.next;
//            }
//        }
//        if(carry == 1){
//            cur.next = new ListNode(carry);
//        }
//        return pre.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
//        var ans = addTwoNumber(l1,l2);
//        System.out.println(ans.val+"->"+ans.next.val+"->"+ans.next.next.val);
//
//    }
//}
//class ListNode{
//    int val;
//    ListNode next;
//    ListNode (int x){this.val = x;}
//}
