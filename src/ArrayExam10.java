/**
 * 
 * �־��� �迭�� �׸񿡼� �ִ밪�� ���غ�����.(for���� �̿��ϼ���)
 * 
 * {1, 5, 3, 8, 2} ������� 8
 *
 */
public class ArrayExam10 {

	public static void main(String[] args) {
		int max = 0;
		int[] j = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < j.length; i++) {
			if (j[i] > max) {					//j�� max���� Ŭ ��
				max = j[i];						//j���� max�� ����
			}

		}
		System.out.println("�ִ밪 : "+max);		//max ���� ���

	}
}