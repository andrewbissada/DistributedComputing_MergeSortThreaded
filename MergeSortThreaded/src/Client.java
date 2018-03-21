import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Client {
	
	public static void main(String[] args) throws Exception {
		Client c1 = new Client();
		c1.run();
		Client c2 = new Client();
		c2.run();
		Client c3 = new Client();
		c3.run();
	}
	
	public void run() throws Exception {
		Socket sock = new Socket("localhost", 444);
		PrintStream PS = new PrintStream(sock.getOutputStream());
		
		InputStreamReader  ir = new InputStreamReader(sock.getInputStream());
        BufferedReader br = new BufferedReader(ir);
		
	}

}
