/**
 * for문 1부터 100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요.
 * 
 */
public class Loop17 {

	public static void main(String[] args) {
		int j = 0;
		int k = 30;
		for (int i = 1; i <= k; i++) {
			if (i % 3 == 0) {
				j += i;
				System.out.print(i);
				if (i != (k-(k%3))) {
				
					System.out.print("+");

					
				}
			}
		

		}
		System.out.println("="+j);
	}

}
