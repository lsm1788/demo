/**
 * ��,��,�� �� �� ��� ����ó�����α׷��� �ۼ��Ͻÿ�.
 * 
 * 
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		int[] grade = new int [5];
		System.out.println(grade.length);		//�迭�� ���� .length
		grade[0] = 98;
		grade[1] = 19;
		grade[2] = 50;
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("����:%d, ����:%d, ����:%d", grade[0], grade[1], grade[2]);
		System.out.printf("%n����:%d %n���:%d", grade[3], grade[4]);
		

	}

}
