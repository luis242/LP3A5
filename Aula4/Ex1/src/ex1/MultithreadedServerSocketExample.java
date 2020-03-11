package ex1;

import java.io.*;
import java.net.*;

public class MultithreadedServerSocketExample {
	public static void main(String[] args) throws IOException {
		try (ServerSocket server = new ServerSocket(7777)) {
			while (true) {
				System.out.println("Server waiting for client.");
				Socket client = server.accept(); // blocks
				System.out.println("Client from " + client.getLocalAddress() + " connected.");
				new Thread(new RunnableWorker(client, server)).start();
			}
		}
	}
}