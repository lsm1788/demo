/**
 * for문
 * 50번 까지 반복하세요
 * 369를 출력하세요
 * 3의 배수일때는 짝 이라고 출력하세요
 * system.out.println("짝");
 * 
 *
 */
public class Loop15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			
			if(i%3 == 0) {
				System.out.println("짝");
				continue;	
			}
			System.out.println(i);
		}
	}

}
