package exemplos;

import java.io.*;
import java.net.*;

public class RunnableWorker implements Runnable {
	private Socket client;
	private ServerSocket server;
	public RunnableWorker(Socket client, ServerSocket server) {
		this.client = client;
		this.server = server;
	}
	@Override public void run() {
		try (BufferedReader in =
				new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter out =
						new PrintWriter(new OutputStreamWriter(client.getOutputStream()))) {
			// processamento da comunicação com o cliente
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Client thread for socket "+client.getLocalAddress()+" is DONE!");
	}
}