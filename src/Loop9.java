/**
 * for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 */
public class Loop9 {

	public static void main(String[] args) {
		int i =0, j = 0;
		for (i = 1; i <= 5; i++) {
			for(j = 1; j<= i; j++) {
			System.out.print("★");	
			}
			System.out.println(" ");	
		}
		System.out.println("------------");
		for (i = 5; i >= 1; i--) {
			for(j = 1; j<= i; j++) {
			System.out.print("★");	
			}
			System.out.println(" ");
		}
	}
}
