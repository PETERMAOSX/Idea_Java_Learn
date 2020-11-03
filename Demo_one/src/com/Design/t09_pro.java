package com.Design;

public class t09_pro {
    public static void main(String[] args) {
        Director director = new Director();
        Product product_1 = director.create(new Builder_1());
        Product product_2 = director.create(new Builder_2());
        var p1 = product_1.toString();
        var p2 = product_2.toString();
        System.out.println(p1+"\n"+p2);
    }
}
interface Builder{
    void buildPart_1();
    void buildPart_2();
    void buildPart_3();
    Product getProduct();
}
class Product{
    private String part1;
    private String part2;
    private String part3;
    private String name;
    public String getPart1() {
        return part1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }
    @Override
    public String toString(){
        return part1+"\n"+part2+"\n"+part3+"\n"+this.name+"已经做好";
    }
}
class Builder_1 implements Builder{
    private Product product;
    public Builder_1(){
        this.product = new Product();
        this.product.setName("牛肉汉堡");
    }

    @Override
    public void buildPart_1() {
        this.product.setPart1("面包");
    }

    @Override
    public void buildPart_2() {
        this.product.setPart2("牛肉");
    }

    @Override
    public void buildPart_3() {
        this.product.setPart3("沙拉酱");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}
class Builder_2 implements Builder{
    private Product product;
    public Builder_2(){
        this.product = new Product();
        this.product.setName("红烧肉炒饭");
    }
    @Override
    public void buildPart_1() {
        this.product.setPart1("米饭");
    }

    @Override
    public void buildPart_2() {
        this.product.setPart2("红烧肉");
    }

    @Override
    public void buildPart_3() {
        this.product.setPart3("酱汁");
    }
    @Override
    public Product getProduct() {
        return this.product;
    }
}
class Director{
    public Product create(Builder builder){
        builder.buildPart_1();
        builder.buildPart_2();
        builder.buildPart_3();
        return builder.getProduct();
    }
}
