package exemplos;

import java.io.*;
import java.net.*;

public class Cliente {
	public static void main(String args[]) {

		try {
			// conecta ao servidor
			Socket cliente = new Socket("localhost", 9876);
			System.out.println("O cliente se conectou ao servidor!");

			// prepara para a leitura da linha de comando
			BufferedReader in = new BufferedReader(
					new InputStreamReader(System.in)
					);

			/* inserir o resto do programa aqui */

			// fecha tudo
			cliente.close();

		} catch (Exception e) {

			// em caso de erro
			System.out.println("Ocorreu um erro na conex�o");
			e.printStackTrace();

		}
	}
}