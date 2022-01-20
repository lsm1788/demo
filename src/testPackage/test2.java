/**
 * 1~10까지의 합은?
 * 1~10까지 합의 과정을 출력하시오
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
	


