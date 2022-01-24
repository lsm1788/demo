/**
 * 
 * 주어진 배열의 항목에서 최대값을 구해보세요.(for문을 이용하세요)
 * 
 * {1, 5, 3, 8, 2} 결과값은 8
 *
 */
public class ArrayExam10 {

	public static void main(String[] args) {
		int max = 0;
		int[] j = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < j.length; i++) {
			if (j[i] > max) {					//j가 max보다 클 때
				max = j[i];						//j값을 max에 저장
			}

		}
		System.out.println("최대값 : "+max);		//max 값을 출력

	}
}