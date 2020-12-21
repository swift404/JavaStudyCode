package Static关键字;
//编程实现Singleton类的测试

public class SingletonTest {
    public static void main(String[] args){
        //1.声明Singleton类型的引用指向该类型的对象
        //Singleton s1 = new Singleton();
        //Singleton s2 = new Singleton();
        //System.out.println(s1 == s2);//比较变量s1的数值是否与变量s2的数值相等 false
        // Singleton.sin = null;可以使对象失效（不能直接用类名.  访问）
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);//ture
    }
}
