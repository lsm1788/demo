/**
 * n*n������
 * 
 * @author smart12
 *
 */
public class ArrayExam8 {

	public static void main(String[] args) {
		
		 //������ ��
		int cube = 3;
		int sum = 0;
		int chkNum = 0;
		//��ü ���� ������
		for(int i = 1; i <= (cube*cube); i++) {
			sum += i;
		}
		chkNum = (sum/(cube*cube))*cube;
		
		
		int[][] arr = { 
				{2,7,6}, 
				{9,5,1}, 
				{4,3,8} 
				};
		int rowCntChk = 0;
		for (int i =0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				rowCntChk += arr[i][j];
				
				
			}
			
			
		}
		if(rowCntChk != (chkNum*cube)) {
			System.out.println("����");
			return;
		}
		int colCntChk = 0;
		for (int i =0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i];
				
				
			}
			
			
		}
		if(colCntChk !=(chkNum*cube)) {
			System.out.println("����");
			return;
		}
		int leftTop = 0;
		for (int i =0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				if(i ==j ) {
					leftTop += arr[j][i];	
				}
			}		
		}
		if(leftTop != chkNum) {
			System.out.println("����");
			return;
		}
		int rightTop = 0;
		for (int i =0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				if(i + j == (cube-1)) {
					rightTop += arr[j][i];	
				}
			}		
		}
		if(rightTop != chkNum) {
			System.out.println("����");
			return;
		
		}
		System.out.println("�����Դϴ�.��������");
	}

}
