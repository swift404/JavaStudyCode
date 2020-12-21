public class Person {
    String name;
    int age;
    int i;

    //自定义成员方法实现所有成员变量的打印
    //返回值类型 方法名称（形参列表）  {方法体；}
    void show() {
        //成员变量和成员方法都属于类内部的成员，因此可以直接成员变量不需要再加引用.的前缀
        System.out.println("我是"+name+",我的年龄是"+age);
    }
    void fenGeFu(){
       System.out.println("_________________");
    }
    //自定义成员方法实现将姓名修改为参数指定数值的行为
    void setName(String s){
        name = s;
    }
    //自定义成员方法实现将年龄修改为参数指定数值的行为
    void setAge(int i){
        age = i;
    }

    //自定义成员方法实现将姓名和年龄修改为指定数值的行为
    void setNameAge(String s,int i){
        name = s;
        age = i;

    }
    //自定义成员方法实现可变长参数的使用
    void showArgument(int num,String... args){
        System.out.println("num="+num);
        for(int i = 0;i < args.length;i++){
            System.out.println("第"+(i+1)+"个参数"+ args[i]);
        }
    }
    //自定义成员方法实现姓名数值的获取并返回的行为
    String getName(){
        return name;        //返回数据并结束当前方法
        //...   执行不到的
    }

    //自定义成员方法实现年龄数值的获取并返回的行为
    int getAge(){
        return age;
    }
    public static void main(String[] args){
        //数据类型（类名） 引用变量名 = new 类名（）；
        //1.声明Person类型的
        Person p = new Person();
       // System.out.println("我是"+p.name);
        p.show();
        System.out.println("666666");
        p.name = "丑八怪";
        p.age = 24;
        //System.out.println("我是"+p.name);
        //调用方法的本质就是根据方法名跳转过去执行方法体后再跳转回这个位置
        p.show();
        p.setAge(99);
        p.setName("lakua");
        p.show();
        p.fenGeFu();
        p.setNameAge("xiao"+"ming",98);
        p.fenGeFu();
        p.show();
        p.showArgument(1);
        p.showArgument(1);
        p.showArgument(1,"参数1","参数2");
        //通过成员方法调用实现成员变量数值并打印
        String str1 = p.getName();

        System.out.println("获取到的姓名是："+str1);
        int i1 = p.getAge();
        System.out.println("获取到的年龄是"+i1);
    }

}
