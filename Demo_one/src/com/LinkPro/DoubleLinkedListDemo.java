package com.LinkPro;

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("双向链表测试：");
        HeroNode2 hero1 = new HeroNode2(1,"宋江","及时雨");
        HeroNode2 hero2 = new HeroNode2(2,"卢俊义","玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3,"吴用","智多星");
        HeroNode2 hero4 = new HeroNode2(4,"林冲","豹子头");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);
        doubleLinkedList.list();
        System.out.println("---------------------");
        doubleLinkedList.update(new HeroNode2(4,"Maoshao","PETERMAOSX"));
        doubleLinkedList.list();

    }
}

class DoubleLinkedList{
    private HeroNode2 head = new HeroNode2(0,"","");
    public HeroNode2 getHead(){
        return this.head;
    }
    //遍历双向链表
    public void list(){
        if(head.next == null){
            System.out.println("链表为空.\n");
            return;
        }
        HeroNode2 temp = head;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
    //添加一个节点到双向链表到最后
    public void add(HeroNode2 heroNode2){
        HeroNode2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = heroNode2;
        heroNode2.prev = temp;
    }
    //修改一个节点的内容
    public void update(HeroNode2 heroNode2){
        if(head.next == null){
            System.out.println("链表为空\n");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == heroNode2.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = heroNode2.name;
            temp.nickname = heroNode2.nickname;
        }
        else{
            System.out.println("节点没有找到，不能修改\n");
        }
    }
    //从双向链表中删除一个节点
    public void del(int no){
        //先判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空，无法删除。");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.prev.next = temp.next;
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
        }
        else{
            System.out.println("要删除的节点不存在。\n");
        }
    }
}

class HeroNode2{
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;
    public HeroNode2 prev;
    public HeroNode2(int no,String name,String nickname){
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }
    @Override
    public String toString(){
        return "HeroNode [no="+this.no+",name="+this.name+",nickname="+this.nickname;
    }
}
