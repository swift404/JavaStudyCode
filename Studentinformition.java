package src;

import java.util.Scanner;

//编程实现学生信息的录入和打印
public class Studentinformition {

        public static void main(String[] args){
            //1.提示用户输入学生的人数并使用变量记录
            System.out.println("请输入录入学生的人数");
            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();
            //2.根据学生的人数准备对应的一位数组
            //声明一个长度为num元素类型为Student类型的一维数组
            //数组中每个元素都是Student类型，也就是说数组中的每个元素都可以看为Student类型的变量，arr{0} = new Student();
            Student[] arr  = new Student[num];

            //3.提示用户输入的每个学生的信息（学号，年龄，姓名）
            for(int i = 0;i<num;i++){
                System.out.println("请输入第"+(i+1)+"个学生信息（学号，年龄，姓名）：");
                arr[i] = new Student(sc.nextInt(),sc.nextInt(),sc.next());
            }
            //4.打印所有学生信息
            System.out.println("该班所有学生信息：");
            for(int i = 0;i< num;i++){
               // System.out.println(arr[i]);打印的是堆区的地址，应该直接打印堆区的内容，
                arr[i].show();
            }

        }
}
