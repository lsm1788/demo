import java.time.LocalDateTime;

/**
 * 
 * 현재시간을 출력해보세요
 * @author smart12
 *
 */
public class Loop7_1 {

	public static void main(String[] args) {
		
		while(true) {
			
			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour()+":");
			System.out.print(ldt.getMinute()+":");
			System.out.println(ldt.getSecond());
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}