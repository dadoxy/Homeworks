package ba.bitcamp.homework26.task04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {

		try {
			Socket client = new Socket("localhost", 8888);
			System.out.println("Client connected.");
			
			FileInputStream fis = new FileInputStream(new File("doge.jpg"));
			OutputStream osw = client.getOutputStream();
			
			byte[] bytes = new byte[BUFFER_SIZE];
			int readBytes;
			
			while((readBytes = fis.read(bytes, 0, BUFFER_SIZE)) > 0){
				osw.write(bytes, 0, readBytes);
			}
			System.out.println("Sent !");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
