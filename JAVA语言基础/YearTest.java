//���ʵ�����������ռ����ǵ������һ��
import java.util.Scanner;

public class YearTest{
	
	public static void main(String[] args){
		//1.��ʾ�û�����������
		Scanner sc = new Scanner(System.in);//����ɨ����
		int year ;
		int month;
		int day;
		System.out.println("�������꣺");
		year = sc.nextInt();
		System.out.println("�������£�");
		month = sc.nextInt();
		while(month < 1 || month > 12){            //���·ݿ�����������Χ�����������ɽ������ѣ�ֻ����һ�����ѣ�
			System.out.println("��������·�������");
			System.out.println("�����������·ݣ�1~12��");
			month = sc.nextInt();
			break;
		}
		System.out.println("���������ڣ�");
		day = sc.nextInt();
		while(day < 1 || day > 31){  				//�����ڿ�����������Χ�����������ɽ������ѣ�ֻ����һ�����ѣ�
			System.out.println("�����������������");
			System.out.println("�����������ڣ�1~31��");
		    day = sc.nextInt();
		break;
		}
		int[] arrrun = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		int[] arrping = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};//����/ƽ���ÿ�������оٳ�����ֱ��ͨ��forѭ������
		int sum = 0;//��ʼ��sum �������������sum�ڣ��Ա��ڽ��м���
		if(year % 4 == 0 ){//�����������������м��㣬��֮��ƽ����㡣
			for(int i = 0; month -1 > i;i++){
				sum = sum + arrrun[i] ;//�������·�֮ǰ�����������ܺͷ���sum
			}
			sum += day;//�������·ݵ������������·�֮ǰ����������Ӹ�ֵ��sum
			System.out.println("���ǽ���ĵ�"+sum+"��");			
		}
		else{
			for(int i = 0; month -1 > i ;i++){     //ƽ����������
				sum = sum + arrping[i] ;
			}
			sum += day;
			System.out.println("���ǽ���ĵ�"+sum+"��");
		}			
	}	
}

