package com.lagou.task10;

public class NomalOuterTest {
    public static void main(String[] args) {
        //1.声明NormalOuter类型的引用指向该类型的对象
        NormalOuter no = new NormalOuter();
        //声明NomalOuter类中内部类 的引用指向内部类的对象
        NormalOuter.NormalInner ni = no.new NormalInner();
        //调用内部类中的show方法
        ni.show();
        System.out.println("------------------");
        ni.show2(2);
    }
}
