/**
 * for문 피보나치수열을 출력하시오. 총 10번만 반복하세요.
 * 
 * 
 */
public class Loop10_1 {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k = 0;
		
		i = 1;
		while(i < 6) {
			i = j;
			j = k;
			k = i + j;
			
			System.out.println(k);
			i++;
		}

	}
}
