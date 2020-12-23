package src.final关键字;

//导入java目录中lang目录下System类中的静态成员out 很少使用
import static java.lang.System.out;


public class SubSuperTest extends SuperTest {
    {
        System.out.println("===========SubSuperTest类中的构造块！");
    }
    static{
        System.out.println("===========SubSuperTestt类中的静态代码块！");
    }
    public SubSuperTest(){
        out.println("============SubSuperTest类中的构造方法体！");
    }
    public static void main(String[] args){
        //使用无参构造子类的对象
        SubSuperTest s1 = new SubSuperTest();
    }
}
