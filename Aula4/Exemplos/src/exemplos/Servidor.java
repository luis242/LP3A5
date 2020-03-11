package exemplos;

import java.io.*;
import java.net.*;

public class Servidor {
	public static void main(String args[]) {
		
		try {
			// cria um servidor
			ServerSocket servidor = new ServerSocket(18981);
			System.out.println("Porta 18981 aberta!");

			// aceita uma conex�o
			Socket cliente = servidor.accept();
			System.out.println("Nova conex�o com o cliente " +
					cliente.getInetAddress().getHostAddress()
					);

			// cria o buffer de leitura
			BufferedReader in = new BufferedReader(
					new InputStreamReader(cliente.getInputStream())
					);

			// l� ate o fim
			while(true) {
				String linha = in.readLine();
				if (linha == null) {
					break;
				}
				System.out.println(linha);
			}

			// fecha tudo
			in.close();
			cliente.close();
			servidor.close();

		} catch (IOException e) {

			// em caso de erro
			System.out.println("Ocorreu um erro na conex�o");
			e.printStackTrace();
		}
	}
	
}