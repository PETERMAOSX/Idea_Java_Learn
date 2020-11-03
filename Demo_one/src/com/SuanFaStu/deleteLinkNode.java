//package com.SuanFaStu;
//
//import java.io.LineNumberInputStream;
//
//public class deleteLinkNode {
//    static ListNode removeNth(ListNode head,int n){
//        ListNode dummy = new ListNode(-1);
//        dummy.next = head;
//        ListNode first = dummy;
//        ListNode second = dummy;
//        for(int i=0;i<n+1;i++){
//            first = first.next;
//        }
//        while(first != null){
//            first = first.next;
//            second = second.next;
//        }
//        second.next = second.next.next;
//        return dummy.next;
//    }
//
//    public static void main(String[] args) {
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        System.out.println(removeNth(node1,2).val);
////        ListNode cur = node1;
////        while(cur != null){
////            System.out.println(cur.val);
////            cur = cur.next;
////        }
//
//    }
//}
// class ListNode {
//    int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }