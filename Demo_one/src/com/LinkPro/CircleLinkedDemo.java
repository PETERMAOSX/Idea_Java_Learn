package com.LinkPro;

public class CircleLinkedDemo {
    public static void main(String[] args) {
        CircleLinkedList circleLinkedList = new CircleLinkedList();
        circleLinkedList.addBoy(10);
        circleLinkedList.showBoy();

    }
}

class CircleLinkedList{
    //创建一个first节点，当前没有编号
    private Boy first = null;
    //添加小孩节点，构建一个环形的链表
    public void addBoy(int nums){
        if(nums < 1){
            System.out.println("nums 值不正确");
            return;
        }
        Boy curBoy = null;
        for(int i=1;i<=nums;i++){
            Boy boy = new Boy(i);
            if(i == 1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }else{
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }
    public void showBoy(){
        if(first == null){
            System.out.println("没有任何小孩");
            return;
        }
        Boy curBoy = first;
        while(true){
            System.out.println("小孩的编号"+curBoy.getNo()+"\n");
            if(curBoy.getNext() == first){
                break;
            }
            curBoy = curBoy.getNext();
        }
    }
    public void countBoy(int startNo,int countNum,int nums){
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        Boy helper = first;
        while(true){
            if(helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        for(int j=0;j<startNo - 1;j++){
            first = first.getNext();
            helper = helper.getNext();
        }
        while(true){
            if(helper == first){
                break;
            }
            for(int j=0;j<countNum -1;j++){
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("小孩"+first.getNo()+"出圈");
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.println("最后留在圈中的小孩的编号"+first.getNo()+"\n");
    }

}

class Boy{
    private int no;
    private Boy next;
    public Boy(int no){
        this.no = no;
    }
    public int getNo(){
        return this.no;
    }
    public void setNo(int no){
        this.no = no;
    }
    public Boy getNext(){
        return this.next;
    }
    public void setNext(Boy next){
        this.next = next;
    }

}
