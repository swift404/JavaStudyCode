package src;
/*
    编程实现Dian类的定义
 */
public class Dian {
    int x;//用于描述横坐标的成员变量
    int y;//用于描述纵坐标的成员变量


    //自定义无参构造方法
    Dian(){

    }
    //自定义有参的构造方法
    Dian(int i,int j){
        x = i;
        y = j;
    }
    //自定义成员方法，
    void show(){
        System.out.println("我的横坐标是"+x+"，我的纵坐标是"+y);
    }


    public static  void main(String[] args){
        //无参方式构造对象并打印特征
        Dian d1 = new Dian();
        d1.show();//0  0
        //有参方式构造对象并打印特征
        Dian d2 = new Dian(13,23);
        d2.show();//13 23

    }
}
