package Static关键字;

public class MainTest {


    public static void main(String[] args){

        System.out.println("参数数组中元素的个数是："+args.length);
        System.out.println("传递给main方法的实际参数为：");
        for(int i= 1;i< args.length;i++){
           System.out.println("下标为"+i+"形参变量数值为："+args[i]);
        }
        //要打印需要在编译时，在类名后输入args内容再运行，就会打印出数组中的内容
    }
}
