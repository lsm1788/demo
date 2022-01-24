
public class Loop14 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			//i값이 5면 멈춰라.
			//if(i == 5) {
			//짝수만 출력하세요
			if(i%2 == 1) {
				continue;	
			}
			System.out.println(i);
		}
	}

}
