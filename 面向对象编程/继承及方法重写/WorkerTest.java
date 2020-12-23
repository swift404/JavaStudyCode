package src.继承及方法重写;

public class WorkerTest {
    public static void main(String[] args){
        //  1.使用无参方式构造Worker类型的对象并打印特征
        Worker w1 = new Worker();
        //当子类重写show方法后，则下面调用的是重写以后的版本
        w1.show(); //null 0
        System.out.println("_________________________");
        //使用有参凡事构造Worker类型的对象并打印特征
        Worker w2 = new Worker("张飞",30,3000);
        w2.show();
        w2.eat("豆芽");
        w2.play("王者荣耀");
        w2.work();
    }
}
