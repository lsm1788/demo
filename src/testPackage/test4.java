/**
 * 구구단 2~9단
 * 
 * 
 */

package testPackage;

public class test4 {

	public static void main(String[] args) {
		
		for(int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			System.out.println(" ");
			for(int j = 1; j < 10; j++) {
				System.out.println(i+"x"+j+" = "+(i*j));
				
			}
			System.out.println(" ");
		}
	}
}
	


