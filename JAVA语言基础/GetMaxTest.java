import java.util.Arrays;

public class GetMaxTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;
        do {
            if ((i+1) * 1.0 / arr.length > 0.8) {
                // break;
                System.out.println("\n������ӽ�������������80%������" + 1.5 + "������");
              	// ����һ�������飬����Ϊԭ����1.5��
                int[] newArr = new int[(int) (arr.length * 1.5)];
              	// ��ֵԭ�������ݵ�������
                System.arraycopy(arr, 0, newArr, 0, arr.length);
              	// ����ԭ����Ԫ����������
                arr = newArr;
            }
            arr[i] = i + 1;
            System.out.printf("��ӵ�%d��Ԫ�أ���ǰ���鳤��Ϊ%d:%s\n", i + 1, arr.length, Arrays.toString(arr));
            i += 1;
        } while (i < 14);
    }
}