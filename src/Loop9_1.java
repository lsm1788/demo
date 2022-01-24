/**
 * for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 */
public class Loop9_1 {

	public static void main(String[] args) {
		int i = 0, j = 0;
		i = 1;
		while (i <= 5) {
			for (j = 1; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println(" ");
			i++;
		}
		System.out.println("------------");
		i = 5;
		while(i >= 1) {
			j = 1;
			while( j <= i) {
				System.out.print("★");
				j++;
			}
			System.out.println(" ");
			i--;
		}
	}
}
