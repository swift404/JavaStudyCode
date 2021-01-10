package com.lagou.task10;

//编程实现所有方法的枚举，所有的方向：向上、向下、向左、向右   枚举类型要求所有枚举值必须放在枚举类型的最前面


public enum  DirectionEnum implements DirectionInterface{
    //2.声明本类类型的引用指向本类类型的对象
    //匿名内部类的语法格式：接口/父类类型 引用变量名 = new 接口/父类类型（）{方法的重写}
    //public static final Direction UP = new Direction("向上"){方法的重写}
    UP("向上"), DOWN("向下"),LEFT ("向左"),RIGHT("向右");
    private final String desc;//用于描述方向字符串的成员变量

    //2.声明本类类型的引用指向本类类型的对象

    //通过构造方法实现成员变量的初始化，更加灵活
    //1.私有化构造方法，只能在本类中使用
    private DirectionEnum(String desc){
        this.desc = desc;
    }
    //通过共有的get方法可以在本类的外部访问该类的成员变量的数值
    public String getDesc() {
        return desc;
    }
    //整个枚举类型只重写一次，所有对象调用同一个
   /* @Override
    public void show() {
        System.out.println("现在可以实现接口中的抽象方法的重写了！");
    }

    */
}
