/**
 * for�� �Ǻ���ġ������ ����Ͻÿ�. �� 10���� �ݺ��ϼ���.
 * 
 * 
 */
public class Loop10 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k = 0;
		
		for (i = 1; i < 6; i++) {
			i = j;
			j = k;
			k = i + j;
			
			System.out.println(k);
		}

	}
}
