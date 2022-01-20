/**
 * 가위[1],바위[2],보[3] 게임프로그램을 작성하시오 두명의 유저가 임의의 값을 선택하여 결과를 출력하는 프로그램
 * 
 * @author smart12
 *
 */
public class ControlFlow10 {

	public static void main(String[] args) {
		int user1 = (int)(Math.random()*3)+1;// 본인
		int user2 = (int)(Math.random()*3)+1;// 상대방
		
		System.out.println("나:");
		if (user1 == 1) {
			System.out.println("가위");
		} else if (user1 == 2) {
			System.out.println("바위");		//나
		} else if (user1 == 3) {
			System.out.println("보");
		}
		System.out.println("상대:");
		if (user2 == 1) {
			System.out.println("가위");
		} else if (user2 == 2) {
			System.out.println("바위");		//상대
		} else if (user2 == 3) {
			System.out.println("보");
		}

		if (user1 == 1 && user2 == 1) {
			System.out.println("비겼습니다.");
		} else if (user1 == 1 && user2 == 2) {
			System.out.println("졌습니다.");			//내가 가위
		} else if (user1 == 1 && user2 == 3) {
			System.out.println("이겼습니다.");

		} else if (user1 == 2 && user2 == 1) {
			System.out.println("이겼습니다.");
		} else if (user1 == 2 && user2 == 2) {
			System.out.println("비겼습니다.");			//내가 바위
		} else if (user1 == 2 && user2 == 3) {
			System.out.println("졌습니다.");
			
		} else if (user1 == 3 && user2 == 1) {
			System.out.println("졌습니다.");
		} else if (user1 == 3 && user2 == 2) {
			System.out.println("이겼습니다.");			//내가 보
		} else if (user1 == 3 && user2 == 3) {
			System.out.println("비겼습니다.");
		}

	}

}
