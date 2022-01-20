
public class ControlFlow8 {

	public static void main(String[] args) {
		int i = 0;
		if (i >= 12) {
			switch (i / 12) {
			case 1:
				System.out.println("¿¬Â÷°¹¼ö:11");
				break;
			case 2:
				System.out.println("¿¬Â÷°¹¼ö:15");
				break;
			case 3:
			case 4:
				System.out.println("¿¬Â÷°¹¼ö:16");
				break;
			case 5:
			case 6:
				System.out.println("¿¬Â÷°¹¼ö:17");
				break;
			case 7:
			case 8:
				System.out.println("¿¬Â÷°¹¼ö:18");
				break;
			case 9:
			case 10:
				System.out.println("¿¬Â÷°¹¼ö:19");
				break;
			case 11:
			case 12:
				System.out.println("¿¬Â÷°¹¼ö:20");
				break;
			case 13:
			case 14:
				System.out.println("¿¬Â÷°¹¼ö:21");
				break;
			case 15:
			case 16:
				System.out.println("¿¬Â÷°¹¼ö:22");
				break;
			case 17:
			case 18:
				System.out.println("¿¬Â÷°¹¼ö:23");
				break;
			case 19:
			case 20:
				System.out.println("¿¬Â÷°¹¼ö:24");
				break;

			default:
				System.out.println("¿¬Â÷°¹¼ö:25");
				break;
			}

		} else if (i == 0) {
			System.out.println("¿¬Â÷°¹¼ö:0");
		} else {
			System.out.println("¿¬Â÷°¹¼ö:"+(i-1));
		}
	}

}
