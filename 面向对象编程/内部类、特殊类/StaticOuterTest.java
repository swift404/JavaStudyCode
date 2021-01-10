package com.lagou.task10;

public class StaticOuterTest {
    public static void main(String[] args) {
        //1.声明StaticInner类型的引用指向该类型的对象
        StaticOuter.StaticInner si  = new StaticOuter.StaticInner();
        //2.调用方法show进行测试
        si.show();
        si.show2(8);
       // StaticOuter.show();
        new StaticOuter().show();
    }
}
