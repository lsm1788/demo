
public class Loop14 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			//i°ªÀÌ 5¸é ¸ØÃç¶ó.
			//if(i == 5) {
			//Â¦¼ö¸¸ Ãâ·ÂÇÏ¼¼¿ä
			if(i%2 == 1) {
				continue;	
			}
			System.out.println(i);
		}
	}

}
