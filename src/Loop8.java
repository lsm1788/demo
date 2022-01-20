/**
 * for문
 * 1부터 10까지 합을 구하세요
 * @author smart12
 *
 *	1 3 5 7 9  
 *	2 4 6 8 10
 */
public class Loop8 {

	public static void main(String[] args) {
		int odd = 0; //홀수합
		int even = 0; //짝수합
		for(int i = 1; i <= 10; i++) {
			//홀수이면 odd에 저장
			if(i%2 ==1) {
				odd += i;
			} else {
				even += i;
			}	
		}
		System.out.println("총합:"+(odd+even));
		System.out.println("짝수합:"+(odd));
		System.out.println("홀수합:"+(even));
	}
}