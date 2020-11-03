//package com.Design;
//
//public class t09 {
//    public static void main(String[] args) {
//        Director director = new Director();
//        ConcreateBuilder builder = new ConcreateBuilder();
//        Product product = director.create(builder);
//        System.out.println(product.toString());
//
//    }
//}
//abstract class Builder{
//    abstract void BuildPartA();
//    abstract void BuildPartB();
//    abstract void BuildPartC();
//    abstract void BuildPartD();
//    abstract Product getProduct();
//}
//
//class Product{
//    private String buildA;
//    private String buildB;
//    private String buildC;
//    private String buildD;
//    public String getBuildA(){
//        return this.buildA;
//    }
//    public void setBuildA(String buildA){
//        this.buildA = buildA;
//    }
//
//    public String getBuildB() {
//        return buildB;
//    }
//
//    public void setBuildB(String buildB) {
//        this.buildB = buildB;
//    }
//
//    public String getBuildC() {
//        return buildC;
//    }
//
//    public void setBuildC(String buildC) {
//        this.buildC = buildC;
//    }
//
//    public String getBuildD() {
//        return buildD;
//    }
//
//    public void setBuildD(String buildD) {
//        this.buildD = buildD;
//    }
//    @Override
//    public String toString(){
//        return buildA+"\n"+buildB+"\n"+buildC+"\n"+buildD+"\n"+"验收完成";
//    }
//}
//class ConcreateBuilder extends Builder{
//    private Product product;
//    public ConcreateBuilder(){
//        product = new Product();
//    }
//    @Override
//    void BuildPartA() {
//        product.setBuildA("地基");
//    }
//
//    @Override
//    void BuildPartB() {
//        product.setBuildB("钢筋工程");
//    }
//
//    @Override
//    void BuildPartC() {
//        product.setBuildC("铺电线");
//    }
//
//    @Override
//    void BuildPartD() {
//        product.setBuildD("粉刷");
//    }
//
//    @Override
//    Product getProduct() {
//        return this.product;
//    }
//}
//
//class Director{
//    public Product create(Builder builder){
//        builder.BuildPartA();
//        builder.BuildPartB();
//        builder.BuildPartC();
//        builder.BuildPartD();
//        return builder.getProduct();
//    }
//}
