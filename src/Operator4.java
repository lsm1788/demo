
public class Operator4 {

	public static void main(String[] args) {
		//���������� ++ (+1�� ��������), -- (-1�� ��������)
		int i = 0;
		i++;
		--i;
		System.out.println(++i);
		
		System.out.println("----------------------");
		//���������� !
		boolean b = false;
		System.out.println(!b);
		
		System.out.println("----------------------");
		//�񱳿����� >, >=, <, <=, ==, !=  ����� boolean
		int m = 10, n =5 ;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println("----------------------");
		//�������� ( and[&&] (�Ѵ� ���϶��� ��), or[||] (�ϳ��� ���̿��� ��), not[!] (���϶� ����, �����϶� ��))
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
		//��Ʈ������ &(and) |(or) ^(xor) ~(not) <<(shift) >> >>>
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
