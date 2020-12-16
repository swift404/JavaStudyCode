package src;
/*
    编程实现方法重载主要形式的测试
 */

public class Overload {
    //自定义成员方法
    void show(){
        System.out.println("show()");
    }
    void show(int i ){   //体现在方法参数的个数不同
        System.out.println("show(int)");
    }
    void show(int i,double d){//体现在方法参数的类型不同
        System.out.println("show(int,double)");
    }

    void show(int i,int j){//体现在方法参数的类型不同
        System.out.println("show(int,int)");
    }
    void show(double d,int i){//体现在方法参数的顺序不同
        System.out.println("show(double,int)");
    }
    /*void show(double a,int b){//error 错误:(24, 10) java: 已在类 src.Overload中定义了方法 show(double,int) 体现在与参数的变量名无关
        System.out.println("show(double,int)");
    }


    int  show(double d,int i){//error与返回值类型无关
        System.out.println("show(double,int)");
    }

     */
    public static void main(String[] args){
        //声明Overload类型的引用指向该类型的对象
        Overload ol = new Overload();
        //调用show方法
        ol.show();
        ol.show(88);
        ol.show(99,88.88);
        ol.show(88,99);
        ol.show(88.88,99);

    }
}
