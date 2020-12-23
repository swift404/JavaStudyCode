package src.final关键字;

public class Dog extends Animal  {

    public int tooth;

    public Dog() {
        super();//表示调用父类的无参构造方法
    }

    public Dog(String name, String color, int tooth) {
        super(name, color);//表示调用父类的有参构造方法
        this.tooth = tooth;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        if(tooth >0) {
            this.tooth = tooth;
        }else {
            System.out.println("牙齿数量不对");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量是"+getTooth());
    }
}
