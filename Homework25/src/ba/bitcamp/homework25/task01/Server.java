package ba.bitcamp.homework25.task01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			System.out.println("Client connected !");

			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
					"links.txt"), true));
			BufferedReader br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String s = "";
			String link = "";
			String name = "";
			while ((s = br.readLine()) != null) {

				link = s.substring(0, s.indexOf(" "));
				name = s.substring(s.indexOf(" ") + 1, s.length());

			}
			if(link.startsWith("www.")){
				bw.write(link + " " + name);
				bw.newLine();
				bw.flush();
			}else{
				bw.write("www." + link + " " + name);
				bw.newLine();
				bw.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
