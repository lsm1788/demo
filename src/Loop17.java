/**
 * for�� 1���� 100���� ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ带 �ۼ��ϼ���.
 * 
 */
public class Loop17 {

	public static void main(String[] args) {
		int j = 0;
		int k = 30;
		for (int i = 1; i <= k; i++) {
			if (i % 3 == 0) {
				j += i;
				System.out.print(i);
				if (i != (k-(k%3))) {
				
					System.out.print("+");

					
				}
			}
		

		}
		System.out.println("="+j);
	}

}
