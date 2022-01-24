/**
 * 계산기 프로그램을 작성하시오.
 * 임의의 두 수를 입력 받아 + - * / % 를 수행하시오.
 * return 사용
 *
 */
public class Method7 {

	public static int add(int i, int j) {
		return i + j;
		
	}
	
	public static int minus(int i, int j) {
		return i - j;

	}
	
	public static int multiply(int i, int j) {
		return i * j;
		
	}
	
	public static int divide(int i, int j) {
		return i / j;

	}
	
	public static int remainder(int i, int j) {
		return i % j;

	}
	
	public static void main(String[] args) {
		int i = 4;
		int j = 2;
		int res = 0;
		res = add(i, j);//더하기
		System.out.println(i+"+"+j+" = "+res);
		res = minus(i, j);//빼기
		System.out.println(i+"-"+j+" = "+res);
		res = multiply(i, j);//곱하기
		System.out.println(i+"x"+j+" = "+res);
		res = divide(i, j);//나누기
		System.out.println(i+"/"+j+" = "+res);
		res = remainder(i, j);//나머지
		System.out.println(i+"%"+j+" = "+res);
	}

	
}
