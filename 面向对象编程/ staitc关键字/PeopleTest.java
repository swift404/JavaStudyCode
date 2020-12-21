package Static关键字;

public class PeopleTest {
    public static void main(String[] args){
        //3.验证Static关键字修饰的静态成员（类成员）是否与创建对象无关  类名.的方式
        //System.out.println("获取到的国籍信息是："+People.country);
        System.out.println("获取到的国籍信息是："+People.getCountry());
        //1.使用有参方式构造两个People类型的对象并打印特征
        People p = new People("masiwei ",18);
        p.show();

        People p1 = new People("knowknow",19);
        p1.show();
        System.out.println("______________________________________");

        //2.验证Static关键字修饰的静态成员（类成员）是否被所有对象共享
        p1.setCountry("China") ;
        /*System.out.println("第一个对象国籍"+ p1.country);
        System.out.println("第二个对象国籍"+ p.country);

         */
        System.out.println("第一个对象国籍"+ p1.getCountry());
        System.out.println("第二个对象国籍"+ p.getCountry());
        People p2 = new People();
        System.out.println("第二个对象国籍"+ p2.getCountry());
    }
}
