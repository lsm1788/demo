/**
 * for문 피보나치수열을 출력하시오. 총 10번만 반복하세요.
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
