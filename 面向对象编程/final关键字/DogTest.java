package src.final关键字;

public class DogTest {
    public static void main(String[] args){
         //1.使用无参方式构造Dog类型对象并打印特征
        Dog d1 = new Dog();
        d1.show();//null null 0



        //2.使用有参方式构造Dog类的对象并打印特征
        Dog d2 = new Dog("huahua","花白",26);
        d2.show();//我是huahua我的颜色是花白 牙齿数量是26
    }
}
