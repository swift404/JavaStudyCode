package src.final关键字;
//
public class Animal {

    private String name;
    private String color;

    public Animal(){

    }
    public Animal(String name,String color){
        setName(name);
        setColor(color);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void show(){
        System.out.println("我是"+getName()+"我的颜色是"+getColor());
    }
}
