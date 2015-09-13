package triangulo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadyFile {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o local e nome de arquivo:\n");
		String nome = ler.nextLine();
		
		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
			
			String linha = lerArq.readLine();
			while (linha != null) {
				String[] spliNr = linha.split(",");
				if(spliNr[0] == spliNr[1] && spliNr[0] == spliNr[2]){
					System.out.printf("\nAs medidas lidas correspondem a um triangulo:\n");
				}
				linha = lerArq.readLine();
			}
			
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	
		System.out.println();
	}


}