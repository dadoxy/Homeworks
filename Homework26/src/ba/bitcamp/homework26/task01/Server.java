package ba.bitcamp.homework26.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8888);

			Socket client = server.accept();
			System.out.println("Client connected !");

			BufferedReader br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			String path = br.readLine();
			File file = new File(path);
			if (file.exists()) {
				bw.write("1");
				bw.newLine();
				bw.flush();
			}else{
				bw.write("0");
				bw.newLine();
				bw.flush();
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
