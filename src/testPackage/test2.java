/**
 * 1~10������ ����?
 * 1~10���� ���� ������ ����Ͻÿ�
 * 
 */

package testPackage;

public class test2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
			System.out.print(i);
			
			if(i<10) {
				System.out.print("+");
			}
			
		}
		System.out.print("="+sum);
	}
}
	


