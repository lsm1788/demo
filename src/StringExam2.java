/**
 * 
 * ���ڿ� String Ŭ����
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		String str = new String("ABC");
		String str2 = new String("ABC");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));		//���ڿ����� ������ ���� �� ���
		System.out.println(str);					//���ڿ������� '==' ���X
		System.out.println(str2);
	}

}
