/**
 * for��
 * 50�� ���� �ݺ��ϼ���
 * 369�� ����ϼ���
 * 3�� ����϶��� ¦ �̶�� ����ϼ���
 * system.out.println("¦");
 * 
 *
 */
public class Loop15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			
			if(i%3 == 0) {
				System.out.println("¦");
				continue;	
			}
			System.out.println(i);
		}
	}

}
