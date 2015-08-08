package ba.bitcamp.homework26.task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
			BufferedReader br = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			Scanner in = new Scanner(System.in);

			System.out.println("Enter path of a file: ");
			String path = in.nextLine();

			bw.write(path);
			bw.newLine();
			bw.flush();

			String s = br.readLine();
			System.out.println(s);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
