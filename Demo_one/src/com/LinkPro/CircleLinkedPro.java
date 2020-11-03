package com.LinkPro;

public class CircleLinkedPro {
    public static void main(String[] args) {
        Node node1 = new Node(1,"托尼","钢铁侠");
        Node node2 = new Node(2,"彼得帕克","蜘蛛侠");
        Node node3 = new Node(3,"斯蒂夫","美国队长");
        DanListNode listNode = new DanListNode();
        listNode.add(node1);
        listNode.add(node2);
        listNode.add(node3);
        System.out.println(listNode.first.nickname);
        System.out.println(node1.nickname);
        System.out.println(node1.next.nickname);
        System.out.println(node1.next.next.nickname);
        System.out.println(node1.next.next.next.nickname);
        System.out.println(node1.next.next.next.next.nickname);
        System.out.println(node1.next.next.next.next.next.nickname);
        System.out.println(node1.next.next.next.next.next.next.nickname);
        System.out.println(node1.next.next.next.next.next.next.next.nickname);


    }
}

class DanListNode{
    public Node first = new Node(0,"first","起始点");
    public DanListNode(){
        this.first.next = first;
    }
    public void add(Node newNode){
        if(this.first.next == null){
            first.next = newNode;
        }
        Node temp = first;
        while(temp.next != first){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = first;
    }
}

class Node{
    public int no;
    public String name;
    public String nickname;
    public Node next;
    public Node(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
}
