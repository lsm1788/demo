
public class ControlFlow8 {

	public static void main(String[] args) {
		int i = 0;
		if (i >= 12) {
			switch (i / 12) {
			case 1:
				System.out.println("연차갯수:11");
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

		} else if (i == 0) {
			System.out.println("연차갯수:0");
		} else {
			System.out.println("연차갯수:"+(i-1));
		}
	}

}
