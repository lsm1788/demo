/**
 * 국,영,수 총 합 평균 성적처리프로그램을 작성하시오.
 * 
 * 
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		int[] grade = new int [5];
		System.out.println(grade.length);		//배열의 길이 .length
		grade[0] = 98;
		grade[1] = 19;
		grade[2] = 50;
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d", grade[0], grade[1], grade[2]);
		System.out.printf("%n총점:%d %n평균:%d", grade[3], grade[4]);
		

	}

}
