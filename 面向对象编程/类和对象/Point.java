package src;


import java.awt.*;

public class Point {
    int x;  //用于描述横坐标的成员变量
    int y;  //用于描述纵坐标的成员变量
    //自定义成员成员方法实现成
    void show() {
        System.out.println("横坐标是：" + x + "，纵坐标是：" + y);
    }
    void fenGeFu(){
        System.out.println("-----------------------------------------");
    }

    void Fix(){
        System.out.println("_________________________");
    }
    void setX(int i){
        x =i;
    }
    void setY(int j){
        y =j;
    }
    //自定义成员方法实现int类型的可变长参数使用
    void showArgument(int... args){
        for(int i = 0;i < args.length;i++){
            System.out.println("下标为"+i+"的元素是"+args[i]);
        }

    }
    //自定义成员方法实现纵坐标减1的行为
    void up(){
        y--;
    }
    //自定义成员方法实现纵坐标减去指定数值的行为
    void up(int dy){
        y-=dy;
    }
    //自定义成员方法实现纵坐标加上指定数值的行为
    void add(int ay){
        y+=ay;
    }
    public static void main(String[] args) {
        //1.声明point类型的饮用指向point类型的对象
        Point p = new Point();
        //System.out.println("横坐标是："+p.x+",纵坐标是："+p.y);//0 0
        p.show();

        System.out.println("_________________________");
        //2.将横坐标修改为3和5再次打印
        p.x = 3;
        p.y = 5;
        //System.out.println("横坐标是："+p.x+"，纵坐标是："+p.y);
        p.show();
        p.setX(10);
        p.setY(16);
        p.Fix();
        p.show();
        p.showArgument(1,2,3,4,5);
        p.fenGeFu();
        p.add(20);
        p.show();
        p.fenGeFu();
        //实调用重载的成员方法
        p.up();
        p.show();
        //调用分隔符
        p.fenGeFu();
        p.up(12);
        p.show();
    }

    //自定义成员方法实现成员变量数值的打印


}
