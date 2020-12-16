package src;

public class Person1 {
    String name;//用于描述姓名的成员变量
    int age;//用于描述年龄的成员变量

    //自定义构造方法
    //String s = "konwkonw"
    //int i =26
    //就近原则 懒人原则（形参变量名与成员变量名名字相同，则会优先利用最近的变量）
    Person1(String s,int i){
        //System.out.println("我就是自定义的构造方法");
        //name = "masiwei";
        //age = 27;
        name = s;
        age = i;
    }
    //自定义无参构造方法
    Person1(){

    }

    //自定义成员方法实现所有特征的打印
    void show(){
        System.out.println("我是"+name+"，今年"+age);
    }
    //自定义成员方法实现年龄增长一岁的行为
    void grow(){
        age++;
    }
    //自定义成员方法实现年龄增长参数指定数值的行为
    void grow(int i){
        age += i;
    }
    public static void main(String[] args) {
        //1. 声明一个Person1类型的引用指向Person1类型的对象
        //当类中没有提供构造方法是，则下面调用默认构造方法，如果有构造方法则调用类中的方法。
        Person1 p1 = new Person1("konwkonw", 26);
        //并打印特征
        p1.show(); //null 0  konwknow 26


        Person1 p2 = new Person1("air", 28);
        p2.show();//masiwei 27


        Person1 p3 = new Person1();//无法将person1类给定类型
        p3.show();

        p1.grow();
        p1.show();//我是konwkonw，今年27


        p1.grow(3);
        p1.show();//我是konwkonw，今年30
    }
}

