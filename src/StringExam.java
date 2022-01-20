/**
 * 
 * 문자열 String 클래스
 *
 */
public class StringExam {

	public static void main(String[] args) {
		String s;
		s = new String("ABC");				// new String 사용하여 변수선언
		System.out.println(s);
		//---------------------------
		String s2 = "ABVVDSG";
											// new String 사용하지않고 변수선언
		System.out.println(s2);
		//---------------------------
		StringBuffer sb = null;				// StringBuffer 'sb'를 선언
		sb = new StringBuffer("ABAB");		// StringBuffer 'sb'에 문자 값을 입력
		sb.append("123");					// 'sb' 값에 문자를 덧붙일때
		sb.append("2435235");
		
		System.out.println(sb);
	}

}
