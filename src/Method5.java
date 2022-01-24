
public class Method5 {

	public static void aaa(int i) {
		System.out.println("aaa()함수가 호출되었습니다."+(++i));
		return;
		
	}
	//static은 static이다.	(static이라는 영역 안에 aaa, bbb, main 의 메소드가 저장되있는 것)
	private static int bbb(int i) {
		i += 1;
		i = i + 1;
		i++;
		return i;
		
	}
	public static void main(String[] args) {
		
		int i = 24;
		i = bbb(i);
		System.out.println(i);
		
	}

	
}
