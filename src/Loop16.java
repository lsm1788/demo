/**
 * for�� 
 * 50�� ���� �ݺ��ϼ���
 * 369�� ����ϼ��� 
 * 3�� ����϶��� ¦ �̶�� ����ϼ��� 
 * system.out.println("¦");
 *
 */
public class Loop16 {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 49) {
			i++;
			if (i % 3 == 0) {
				System.out.println("¦");
				continue;
			}
			System.out.println(i);

		}
	}

}
