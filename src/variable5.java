
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
		 * i����20, j���� 10
		 */
		
		System.out.println("i����" + i);
		System.out.println("j����" + j);		
	}
	
}
