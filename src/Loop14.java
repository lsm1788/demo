
public class Loop14 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			//i���� 5�� �����.
			//if(i == 5) {
			//¦���� ����ϼ���
			if(i%2 == 1) {
				continue;	
			}
			System.out.println(i);
		}
	}

}
