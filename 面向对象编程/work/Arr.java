package lagou.homework2;

import java.util.Random;

public class Arr {

    public static void main(String[] args) {
        int num = 0;


        Random ra = new Random();
        int[][] arr2 = new int[16][16];
        for(int i = 0;i < arr2.length;i++){
            for (int j =0;j < arr2.length;j++){
               arr2[i][j] =ra.nextInt(100);//生成随机数（0-100），且将其放入二维数组中
                System.out.print(arr2[i][j]+"   ");
                num =num+1;
            }
            System.out.println(" ");
        }
        System.out.println(num);
        //每行元素累加和
        for(int i =0;i < arr2.length;i++){
            int sum =0;
            for (int j = 0;j<arr2.length;j++){
                sum = sum + arr2[i][j];
            }
            System.out.println("第"+(i+1)+"行的累加和为"+sum);
        }
        System.out.println("--------------------------------");
        for(int j =0;j < arr2.length;j++){
            int sum =0;
            for (int i = 0;i<arr2.length;i++){
                sum = sum + arr2[i][j];
            }
            System.out.println("第"+(j+1)+"列的累加和为"+sum);
        }
        System.out.println("--------------------------------");
        int sum1 = 0;
        for(int i =0;i < arr2.length;i++){

            sum1 = sum1+arr2[i][i];
        }
        System.out.println("左上角到右下角的所有元素累加和为"+sum1);
        System.out.println("--------------------------------");
        int sum2 = 0;
        for (int i = 0;i < arr2.length;i++){
            sum2 = sum2+arr2[i][arr2.length-i-1];//此处减1是因为数组是从0开始的，第一个16个元素的位置是[16-1].

        }
        System.out.println("右上角到左下角的元素累加和为"+sum2);
    }
}
