package com.lagou.task10;

public class DirectionTest {
    public static void main(String[] args) {
       /* Direction d1 = new Direction("向上");
        System.out.println("获取到的字符串是"+d1.getDesc());
        Direction d2 = new Direction("向下");
        System.out.println("获取到的字符串是"+d2.getDesc());
        Direction d3 = new Direction("向左");
        System.out.println("获取到的字符串是"+d3.getDesc());
        Direction d4 = new Direction("向右");
        System.out.println("获取到的字符串是"+d4.getDesc());
        Direction d5 = new Direction("向前");
        System.out.println("获取到的字符串是"+d5.getDesc());
        */
        //声明direction类型的引用指向该类型的对象并打印特征
        Direction d1 = Direction.UP;
        System.out.println("获取到的方向是="+d1.getDesc());
        System.out.println("________________________");
        DirectionEnum de = DirectionEnum.DOWN;
        System.out.println("获取到的方向是"+de.getDesc());
    }
}
