
public class Operator4 {

	public static void main(String[] args) {
		//증감연산자 ++ (+1과 같은수식), -- (-1과 같은수식)
		int i = 0;
		i++;
		--i;
		System.out.println(++i);
		
		System.out.println("----------------------");
		//부정연산자 !
		boolean b = false;
		System.out.println(!b);
		
		System.out.println("----------------------");
		//비교연산자 >, >=, <, <=, ==, !=  결과는 boolean
		int m = 10, n =5 ;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println("----------------------");
		//논리연산자 ( and[&&] (둘다 참일때만 참), or[||] (하나만 참이여도 참), not[!] (참일땐 거짓, 거짓일땐 참))
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println("----------------------");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println("--------------------");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println("--------------------");
		//비트연산자 &(and) |(or) ^(xor) ~(not) <<(shift) >> >>>
		byte bitNum1 = 15;
		byte bitNum2 = 3;
		System.out.println(bitNum1 & bitNum2);
		System.out.println(bitNum1 | bitNum2);
		System.out.println(bitNum1 ^ bitNum2);
		System.out.println(~bitNum2);
		System.out.println(bitNum2<<2);
		System.out.println(bitNum2>>2);
		System.out.println(bitNum2>>>1);
	}

}
