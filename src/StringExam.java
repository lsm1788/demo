/**
 * 
 * ���ڿ� String Ŭ����
 *
 */
public class StringExam {

	public static void main(String[] args) {
		String s;
		s = new String("ABC");				// new String ����Ͽ� ��������
		System.out.println(s);
		//---------------------------
		String s2 = "ABVVDSG";
											// new String ��������ʰ� ��������
		System.out.println(s2);
		//---------------------------
		StringBuffer sb = null;				// StringBuffer 'sb'�� ����
		sb = new StringBuffer("ABAB");		// StringBuffer 'sb'�� ���� ���� �Է�
		sb.append("123");					// 'sb' ���� ���ڸ� �����϶�
		sb.append("2435235");
		
		System.out.println(sb);
	}

}
