/**
 * 1~10까지의 홀수의 합은?
 * 
 * 
 */

package testPackage;

public class test1 {

	public static void main(String[] args) {
		int j = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2 != 0) {
				j += i;
				
			}
				
		}
				System.out.println(j);
	}
}
	


