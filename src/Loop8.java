/**
 * for��
 * 1���� 10���� ���� ���ϼ���
 * @author smart12
 *
 *	1 3 5 7 9  
 *	2 4 6 8 10
 */
public class Loop8 {

	public static void main(String[] args) {
		int odd = 0; //Ȧ����
		int even = 0; //¦����
		for(int i = 1; i <= 10; i++) {
			//Ȧ���̸� odd�� ����
			if(i%2 ==1) {
				odd += i;
			} else {
				even += i;
			}	
		}
		System.out.println("����:"+(odd+even));
		System.out.println("¦����:"+(odd));
		System.out.println("Ȧ����:"+(even));
	}
}