package src;
//编程实现Student类的封装   封装类
public class Student {
    //1.私有化成员变量，使用private关键字修饰
    //private关键字修饰表示私有的含义，也就是该成员变量只能在当前类的内部使用
    private int age;
    private String name;
    private int id;

    public Student(){}
    public Student(int id,int age,String name){
            /*this.age = age;
            this.name = name;

             */
            //d
            setId(id);
            setAge(age);
            setName(name);
    }



    //2.提供公有的get和set方法，并在方法提中进行合理值的判断
    //使用public关键字修饰，表示公有的含义，也就是该方法可以在任意位置使用
    public int getAge(){
        return age;
    }
    public void  setAge(int age){
        if(age >0) {
            this.age = age;
        }else{
            System.out.println("年龄不合理嗷！");
        }
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public  String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    //自定义成员方法实现特征的打印
   /* void insert(int x,String y){
        age = x;
        name = y;
    }
    */
    //什么修饰符都没有叫做默认的访问权限，级别介于priva和public中间。
    public void show(){
        //System.out.println("我是"+name+"我的年龄是："+age);
        System.out.println("我是"+getName()+"我的年龄是"+getAge());
    }
}
