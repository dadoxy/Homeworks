package ba.bitcamp.homework25.task01;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("localhost", 8888);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			Scanner in = new Scanner(System.in);
			System.out.println("Enter link and name of a site: ");
			String adress = in.nextLine();

			while (true) {
				if (adress.length() > 0 && adress.contains(" ")) {
					bw.write(adress);
					bw.newLine();
					bw.flush();
				} else {
					System.out.println("Not valid site ! Try again.");
					adress = in.nextLine();
				}
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
