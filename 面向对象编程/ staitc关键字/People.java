package Static关键字;
//编程实现People类的封装
public class People {
    //私有化成员变量，使用priavate关键字修饰
    private String name;
    private int age;
    //private String country; //隶属于对象层级，也就是每个对象都拥有独立的一份
   public static String country;
    //3.在构造方法中调用set方法进行合理值的判断
    public People(){}
    public People(String name,int age/*String country*/){
        setName(name);
        setAge(age);
        setCountry(country);
    }
    //2提供共有的get和set方法，并在方法体中进行合理值的判断
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void  setAge(int age){
        if(age >0 && age < 150) {
            this.age = age;
        }else{
            System.out.println("年龄有误");
        }

    }
    public int getAge(){
        return age;
    }
    public static String getCountry(){
        return country;
    }
    public static void setCountry(String country){
        //this.country = country;
        People.country = country;
    }
    public void show(){
        System.out.println("我是："+getName()+"，我"+getAge()+"岁了，我来自"+getCountry());
    }
}
