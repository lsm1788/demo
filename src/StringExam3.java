/**
 * 
 * ���ڿ� String Ŭ����
 *
 */
public class StringExam3 {

	public static void main(String[] args) {
		String str = "ABC";
		String str2 = "abc";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));		//���ڿ����� ������ ���� �� ���
		System.out.println(str);					//���ڿ������� '==' ���X
		System.out.println(str2);
	}

}
