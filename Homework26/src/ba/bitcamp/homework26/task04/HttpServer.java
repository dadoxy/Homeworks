package ba.bitcamp.homework26.task04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8888);

			Socket client = server.accept();

			String imgName = client.getInetAddress().getHostName();

			File f = new File(imgName + ".jpg");

			downloader(client, f);
			
			while(true){
				Socket client1 = server.accept();
				System.out.println("Connected.");
				httpServer(client1, f);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void httpServer(Socket client, File f) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			BufferedReader fileReader = null;
			String htmlDoc = "";

			String fromClient = br.readLine();
			String adress = "files.html";
			String[] adresses = fromClient.split(" ");

			if (adresses[1].equals("/" + f.getName())) {
				adress = "/" + f.getName();
			}

			if (adress.equals("files.html")) {
				fileReader = new BufferedReader(
						new FileReader(new File(adress)));

				while (fileReader.ready()) {
					htmlDoc += fileReader.readLine();
				}

				htmlDoc += "Picture link: "
						+ "<a href ="
						+ f.getName()
						+ ">"
						+ f.getName()
						+ "</a> "
						+ "Name: "
						+ f.getName()
								.substring(0, f.getName().lastIndexOf("."))
						+ "<br>\n";
				
				htmlDoc += "</p></body></html>";
				bw.write(htmlDoc);
				bw.newLine();
				bw.flush();
			}else
				photoUploader(client, f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void photoUploader(Socket client, File f) {
		
		try {
			FileInputStream reader = new FileInputStream(new File(f.getName()));
			OutputStream writer = client.getOutputStream();
			
			byte[] bytes = new byte[1024];
			int readBytes;
			while((readBytes = reader.read(bytes, 0, 1024)) > 0){
				writer.write(bytes, 0, readBytes);
			}
			System.out.println("Sent");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static void downloader(Socket client, File f) {

		try {
			InputStream is = client.getInputStream();
			FileOutputStream fos = new FileOutputStream(f);

			byte[] bytes = new byte[1024];

			int readBytes;

			while ((readBytes = is.read(bytes, 0, 1024)) > 0) {
				fos.write(bytes, 0, readBytes);
			}

			System.out.println("Image saved.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
