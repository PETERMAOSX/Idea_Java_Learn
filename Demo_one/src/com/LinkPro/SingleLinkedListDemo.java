package com.LinkPro;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"托尼","钢铁侠");
        HeroNode hero2 = new HeroNode(2,"斯蒂夫","美国队长");
        HeroNode hero3 = new HeroNode(3,"罗曼洛夫","黑寡妇");
        HeroNode hero4 = new HeroNode(4,"彼得帕克","蜘蛛侠");
        HeroNode hero6 = new HeroNode(6,"PETRTMAOSX","毛少雄");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero6);
        singleLinkedList.addByOrder(new HeroNode(5,"索尔","雷神"));
        singleLinkedList.list();
        System.out.println("----------------");
        resersePrintStack(singleLinkedList.getHead());
    }

    public static void resersePrintStack(HeroNode head){
        if(head.next == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        while(stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    public static void reversePrint(HeroNode head){
        if(head == null || head.next.next == null){
            return;
        }
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reverseHead = new HeroNode(0,"","");
        while(cur != null){
            next = cur.next;
            cur.next = reverseHead.next;
            reverseHead.next = cur;
            cur = next;
        }
        head.next = reverseHead.next;
    }
    public static int getlength(HeroNode head){
        if(head.next == null){
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while(cur != null){
            length ++;
            cur = cur.next;
        }
        return length;
    }
    public static HeroNode findLastIndexNode(HeroNode head,int index){
        if(head.next == null){
            return null;
        }
        int size = getlength(head);
        if(index <= 0 || index > size){
            return null;
        }
        HeroNode cur = head.next;
        for(int i= 0;i < size - index;i++){
            cur = cur.next;
        }
        return cur;
    }
}
class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"","");
    public HeroNode getHead(){
        return this.head;
    }
    //添加节点到单向链表
    //1. 找到当前链表的最后节点
    //2. 将最后这个节点的next 指向 新的节点
    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while(true){
            if (temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }
    //添加英雄到指定节点，根据排名将英雄插入到指定位置
    public void addByOrder(HeroNode heroNode){
        //使用一个辅助指针（变量）来帮助找到添加的为止
        HeroNode temp = head;
        //声明一个判断是否已经找到位置的flag
        boolean flag = false;
        while(true){
            //如果到了尾部还没有找到能插的位置
            if(temp.next == null){
                break;
            }
            //如果后面的no大于了现在的no
            if(temp.next.no > heroNode.no){
                break;
            }
            //如果存在这个no flag要为true
            else if(temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            //temp 遍历
            temp = temp.next;
        }
        if(flag){
            System.out.println("准备插入的英雄 no="+heroNode.no+"已经存在，不能加入\n");
        }
        else{
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }
    //修改节点的信息，根据no编号来修改
    public void update(HeroNode newHeronode){
        if(head.next == null){
            System.out.println("链表为空~");
            return;
        }
        //找到需要修改的节点，根据no编号
        //定义一个辅助变量
        HeroNode temp = head.next;
        boolean flag = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == newHeronode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = newHeronode.name;
            temp.nickname = newHeronode.nickname;
        }
        else{
            System.out.println("没有找到 编号 "+newHeronode.no+"的节点，不能修改\n");
        }
    }
    //删除节点
    //1. head 不能动，因此我们需要一个temp辅助节点找到待删除节点的前一个节点
    //2. 说明我们在比较时，是temp.next.no 和 需要删除的节点no比较
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next = temp.next.next;
        }else{
            System.out.println("要删除 "+no+"节点不存在\n");
        }
    }
    //显示节点
    public void list(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;
    public HeroNode(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
    @Override
    public String toString(){
        return "HeroNode [no="+this.no+", name=" + this.name + ", nickname=" + nickname+"]";
    }
}
