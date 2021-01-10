package com.lagou.task10;

import com.sun.jdi.Value;

//@MyAnnotation(value = "hello",value2 = "world") //表示将标签MyAnnotation
@MyAnnotation(value2 = "world")
public class Person {
    /*
    name是用于描述姓名的成员变量
     */
    @MyAnnotation(value2 = "1")
    private String name;
    /**
     * age是用于描述年龄的成员变量
     */
    @MyAnnotation(value2 = "2")
    private int age;
    
//编程实现无参构造方法
    public Person() {
    }
    //编程实现有参构造方法
    //@param name
    //@param age
    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    * 自定义成员方法实现特征的获取和修改
    * @return
    * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
