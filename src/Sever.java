import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever extends Thread {
	
	final static int SERVER_PORT = 1225;
	final static String MESSAGE_TO_SERVER = "Hello, Client!";
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
			try {
				serverSocket = new ServerSocket(SERVER_PORT);
			
				while(true) {
					System.out.println("socket ���� ���");
					Socket socket = serverSocket.accept();
					System.out.println("host"+socket.getInetAddress()+"��� ���Ἲ��");
					
					InputStream is = socket.getInputStream();
					OutputStream os = socket.getOutputStream();
					
					byte[] data = new byte[16];
					int n = is.read(data);
					final String messageFromClient = new String(data,0,n);
					System.out.println(messageFromClient);
					
					os.write(MESSAGE_TO_SERVER.getBytes());
					os.flush();
					
					is.close();
					os.close();
					
					
					socket.close();
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
	}

}
