
import java.util.Arrays;
import java.util.Random;
 
public class BallTest{
    public static void main(String[] args) {
        
        int[] redArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        int[] blueArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
 
        Random random = new Random();
 
        int[] redBall = new int[6]; //�������
		
        boolean[] flag = new boolean[33]; //����red���飬����ѡ��ĺ������
		
        for (int i = 0; i < redBall.length; i++) {
            //�����ѡ��һ��λ��
            //���ж��Ƿ�Ҫ�ظ���ѡ��һ��λ��
            int j;
            do {
                j = new Random().nextInt(redArray.length);
            }
            while (flag[j]);
            //ѡ��jλ�õ�ֵ������������
            redBall[i] = redArray[j];
            flag[j] = true;//���jλ����ѡ��
        }
        System.out.println("�������Ϊ��" + Arrays.toString(redBall));
 
        int blueBall = random.nextInt(blueArray.length);
        System.out.println("�������Ϊ��" + blueBall);
 
    }
}