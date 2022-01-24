import java.util.Scanner;

public class Method3 {

	public static void aaa(int i) {

		//int i = 0; //나는 xx개월차다.
	
		int i2 = i / 12;
		if(i%12 >0) {
			i2 ++;
		}
		
			switch (i2) {
			case 1:
				System.out.println("연차갯수:"+(i-1)+"개");
				break;
			case 2:
				System.out.println("연차갯수:15개");
				break;
			case 3:
			case 4:
				System.out.println("연차갯수:16개");
				break;
			case 5:
			case 6:
				System.out.println("연차갯수:17개");
				break;
			case 7:
			case 8:
				System.out.println("연차갯수:18개");
				break;
			case 9:
			case 10:
				System.out.println("연차갯수:19개");
				break;
			case 11:
			case 12:
				System.out.println("연차갯수:20개");
				break;
			case 13:
			case 14:
				System.out.println("연차갯수:21개");
				break;
			case 15:
			case 16:
				System.out.println("연차갯수:22개");
				break;
			case 17:
			case 18:
				System.out.println("연차갯수:23개");
				break;
			case 19:
			case 20:
				System.out.println("연차갯수:24개");
				break;

			default:
				System.out.println("연차갯수:25개");
				break;
			}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 22; i++) {
			aaa((i+1)*12);	
		}
		
		
	}
}
