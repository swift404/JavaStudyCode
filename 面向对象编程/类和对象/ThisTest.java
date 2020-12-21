public class ThisTest {
    //自定义构造方法
    ThisTest(){
        //代表当前正在构造的对象
        System.out.println("构造方法"+this);

    }
    //自定义成员方法
    void show(){
        //this代表当前正在调用的对象
        System.out.println("成员方法中：this = "+this);

    }
    public static void main(String[] args){
        //声明ThisTest类型的引用指向该类型的对象
        ThisTest tt = new ThisTest();
        //调用show方法
        System.out.println("main方法中类：tt ="+tt);
        tt.show();
    }
}
