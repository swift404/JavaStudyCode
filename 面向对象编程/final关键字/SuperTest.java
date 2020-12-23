package src.final关键字;

public class SuperTest {

    {
        System.out.println("SuoerTest类中的构造块！");
    }
    static{
        System.out.println("SuperTest类中的静态代码块！");
    }
    public SuperTest(){
        System.out.println("SuperTest类中的构造方法体！");
    }
    public static void main(String[] args){
        //使用无参构造方法
        SuperTest s1 = new SuperTest();
    }
}
