public class CheckerboardTest{
	public static void main(String[] args){
		//1���������ֺ���ĸ��һ˲�䣬��һ��Ӧ����asc���ӡ��ASCII 48~57,97~102��43��0
		//2������forѭ������һ��forѭ���У���0����ӡ0��Ȼ��ѭ��10��48~57����ѭ��10��97~120
		//�����������Ա���
		int[] arr = {0,48,49,50,51,52,53,54,55,56,57,97,98,99,100,101,102};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				//��һ�д�ӡ����˳������
				if(0==i){
					char num = (char)arr[j];
					System.out.print(num+" ");
				//��һ�д�ӡ����˳������
				}else if(0==j){
					char num = (char)arr[i];
					System.out.print(num+" ");
				}else{
					System.out.print("+" +" ");
				}
			}
			System.out.println();
			
			
		}
	}
}