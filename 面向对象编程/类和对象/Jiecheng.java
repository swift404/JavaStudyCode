package src;
//编程实现参数n的阶乘并打印。
public class Jiecheng {
    //自定义成员方法实现将参数N的戒嗔给计算出来并返回
    int i;
    int show(int n){
        //递推
        //
        /*
        int num = 1;
        for (i=1;i<=n;i++){
            num *=i;
        }
        return num;
    }
    */
        //递归的方式
      if(1 == n){
      return 1;
      }
      //否则阶乘的结果就是 n*（n-1）
      return n*show(n-1);
      //show（3）=>return 3*show(2);=>show(2) = >2*show(1)=>1 =1.
    }

    public static void main(String[] args){
        //声明JIecheng类型的引用指向该类型的对象
        Jiecheng j1 = new Jiecheng();
        //调用方法进行计算并打印
        int x = j1.show(3);
        System.out.println("最终的计算结果是："+x);
    }
}
