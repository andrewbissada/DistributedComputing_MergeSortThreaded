import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		
		Server s1 = new Server();
		s1.run();
	}
	
	
	public void run() throws Exception {
	   ServerSocket srvsock = new ServerSocket(444); 
       Socket sock = srvsock.accept();
       InputStreamReader  ir = new InputStreamReader(sock.getInputStream());
       BufferedReader br = new BufferedReader(ir);
	}
	
}
