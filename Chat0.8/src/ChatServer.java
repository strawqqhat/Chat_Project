import java.io.*;
import java.net.*;

public class ChatServer {
	
	
	
	public static void main(String[] args) {
		boolean started = false;
		try {
			ServerSocket ss = new ServerSocket(8888);
			started = true;
			while(started) {
				boolean bConnected = false;
				Socket s = ss.accept();
System.out.println("a client connected!");
				bConnected = true;
				DataInputStream dis = new DataInputStream(s.getInputStream());
				while(bConnected) {
					String str = dis.readUTF();
					System.out.println(str);
				}
				dis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
