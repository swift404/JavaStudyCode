//���ʵ�ֱ���ҳ� 1000 ���ڵ�������������ӡ������ ��ν��������һ����ǡ�õ�����������֮�ͣ��磺6=1��2��3

public class WanNumTest{
	public static void main(String[] args){
		
		for(int i = 1;i <=1000;i++){//��ӡ��1000��������
			int num = 0;
			for(int j = 1;j < i;j++){  //��ÿ������ɸѡ��
				if(i % j == 0){
					num = num + j; //�������������
				}
			}
			if(i == num){//������Ӻ���iֵ��ȣ����ӡ��
				System.out.println("1000�ڵ������У�"+num);
			}
		}
	}
}