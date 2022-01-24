/**
 * 계산기 프로그램을 작성하시오.
 * 임의의 두 수를 입력 받아 + - * / % 를 수행하시오.
 * 
 *
 */
public class Method6 {

	public static void add(int i, int j) {
		
		System.out.println(i+"+"+j+"="+(i + j));	// i+j 수식을 우선순위를 주기위해 () 안에 넣는다
	}
	
	public static void minus(int i, int j) {
		
		System.out.println(i+"-"+j+"="+(i - j));

	}
	
	public static void multiply(int i, int j) {
		
		System.out.println(i+"x"+j+"="+(i * j));
		
	}
	
	public static void divide(int i, int j) {
		
		System.out.println(i+"/"+j+"="+(i / j));

	}
	
	public static void remainder(int i, int j) {
		
		System.out.println(i+"%"+j+"="+(i % j));

	}
	
	public static void main(String[] args) {
		int i = 4;
		int j = 2;
		
		add(i, j);//더하기
		minus(i, j);//빼기
		multiply(i, j);//곱하기
		divide(i, j);//나누기
		remainder(i, j);//나머지
	}

	
}
