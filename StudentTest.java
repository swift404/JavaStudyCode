package src;

public class StudentTest {
    public static void main(String[] args){
        //1.声明一个Student类型的引用指向Student类型的对象
        Student s1 = new Student();
        //2.对成员变量进行复制打印
        /*
        s1.insert(20,"laxi");
        s1.show();
        s1.age = 100;
        s1.show();//我是laxi我的年龄是：20     我是laxi我的年龄是：100


         */
        s1.setAge(-22);//年龄不合理嗷！    我是laxi我的年龄是：0
        s1.setName("laxi");
        s1.show();
        //3.使用有参方式构造对象并打印特征
        Student s2 = new Student(1,-28,"knowknow");
        s2.show();
       // s1.show();
    }
}
