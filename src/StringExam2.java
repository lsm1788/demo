/**
 * 
 * 문자열 String 클래스
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));		//문자열에서 같은지 비교할 때 사용
		System.out.println(str);					//문자열에서는 '==' 사용X
		System.out.println(str2);
	}

}
