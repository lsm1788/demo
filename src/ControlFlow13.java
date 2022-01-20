/*
 * 
 * 월별
 */

import java.util.Scanner;

public class ControlFlow13 {

	public static void main(String[] args) {
		//사용자로부터 입력을 받기위한 scan객체 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("년차를 입력하세요.");
		int i = 0; //나는 xx개월차다.
		
		do {
			System.out.println("usage:양수값을 입력하셔야합니다");
			i = scan.nextInt();
		} while (i < 1);
		
		int i2 = i / 12;
		if(i%12 >0) {
			i2 ++;
		}
		
			switch (i2) {
			case 1:
				System.out.println("연차갯수:"+(i-1)+"");
				break;
			case 2:
				System.out.println("연차갯수:15");
				break;
			case 3:
			case 4:
				System.out.println("연차갯수:16");
				break;
			case 5:
			case 6:
				System.out.println("연차갯수:17");
				break;
			case 7:
			case 8:
				System.out.println("연차갯수:18");
				break;
			case 9:
			case 10:
				System.out.println("연차갯수:19");
				break;
			case 11:
			case 12:
				System.out.println("연차갯수:20");
				break;
			case 13:
			case 14:
				System.out.println("연차갯수:21");
				break;
			case 15:
			case 16:
				System.out.println("연차갯수:22");
				break;
			case 17:
			case 18:
				System.out.println("연차갯수:23");
				break;
			case 19:
			case 20:
				System.out.println("연차갯수:24");
				break;

			default:
				System.out.println("연차갯수:25");
				break;
			}

		}
		
	}


