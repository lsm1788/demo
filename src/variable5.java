
public class variable5 {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		//start
		int k = i;
		i = j;
		j = k;
		
		//end
		/*
		 * i값은20, j값은 10
		 */
		
		System.out.println("i값은" + i);
		System.out.println("j값은" + j);		
	}
	
}
