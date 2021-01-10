package com.lagou.task10;
//编程实现方向枚举类的测试，调用从Eunm类中继承下来的方法
public class DiractionEnumTest {
    public static void main(String[] args) {
        //1.获取DirectionEnum类型中所有的枚举类型
        DirectionEnum[] arr = DirectionEnum.values();
        //2.打印每个枚举对象在枚举类型中的名称和索引位置
        for (int i =0;i <arr.length;i++){
            System.out.println("获取到的枚举对象名称是："+arr[i].toString());
            System.out.println("获取到的对应的索引位置是："+arr[i].ordinal());
        }
        //3.将参数指定的字符串名转为当前枚举类的对象
       // DirectionEnum de =  DirectionEnum.valueOf("UP");//编译ok，运行发生IllegalArgumentException
        //DirectionEnum de =  DirectionEnum.valueOf("DOWN LEFT");//要求字符串必须在枚举对象内存在
        DirectionEnum de =  DirectionEnum.valueOf("DOWN");
       // System.out.println("转换初来的枚举对象名称是"+ de.toString());
        System.out.println("转换初来的枚举对象名称是"+ de);//当打印引用变量时，会自动调用toStrign方法

        //4.使用获取到的枚举对象与枚举类中已有的对象比较相互顺序。
        for(int i =0;i < arr.length;i++){
            //当调用对象在参数对象之后，获取到的比较结果为   正数
            //当调用对象在参数对象相同位置时，则获取到的比较结果为  零
            //当调用对象在参数之前时，则获取到的1比较结果为   负数
            System.out.println("调用对象与数组中对象比较的先后顺序结果是："+de.compareTo(arr[i]));
        }
        System.out.println("_________________________________________");

    //5.使用数组中每个DirectionEnum对象都去调用show方法测试
        for (int i = 0;i>arr.length;i++){
            DirectionUseTest.show();
        }
    }
}