/**
 * for문
 * 2022년부터 본인의 생년까지 반복해서 출력해보세요
 * @author smart12
 *
 */
public class Loop3 {

	public static void main(String[] args) {
		int myAge = 1994;
		
		for(int i = 2022; i >= myAge; i--) {
			System.out.printf("년도 %d, 나이 %d %n", i, i - (1994-1));
			
		}
	}

}

