import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Html {

	public static void main(String[] args) {

		try {
			ServerSocket htmlServer = new ServerSocket(8888);

			ArrayList<String> links = new ArrayList<String>();
			ArrayList<String> names = new ArrayList<String>();

			BufferedReader linkReader = new BufferedReader(new FileReader(
					"links.txt"));

			while (true) {
				Socket client = htmlServer.accept();

				if (linkReader.ready()) {
					String s = linkReader.readLine();
					String link = s.substring(0, s.indexOf(" "));
					String name = s.substring(s.indexOf(" ") + 1, s.length());
					if (link.contains("www.")) {
						links.add(link);
					} else
						links.add("www." + link);
					names.add(name);
				}
				
				BufferedWriter htmlWriter = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				String htmlFile = "";

				Iterator<String> it = links.iterator();
				int index = 0;
				while (it.hasNext()) {
					it.next();
					htmlFile += "<a href =" + "http://" + links.get(index)
							+ ">" + "</a>";
					index++;
				}
				htmlWriter.write(htmlFile);
				htmlWriter.newLine();
				htmlWriter.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
