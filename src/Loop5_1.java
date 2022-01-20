/**
 * for문
 * 2022년 월별 일자를 출력하시오(1~31) 
 * @author smart12
 *
 */
public class Loop5_1 {

	public static void main(String[] args) {
		int j = 1;
		while( j<=12) {
			int lastDayOfMonth = 0;
			switch (j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			
			System.out.print(j+"월 ");
			j++;
			
			int i = 1;
			while( i <= lastDayOfMonth) {
			System.out.print(i+" ");
			i++;
		}	
		System.out.println();
		}
	}

}

