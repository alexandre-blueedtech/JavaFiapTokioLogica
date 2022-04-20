package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		String numStr = entrada.nextLine();
		int num = Integer.parseInt(numStr);
		
		int centena = (num / 100) * 100; // existem outras formas.. utilizando Math....
		
		int resto1 = num - centena;
		
		int dezena = (resto1 / 10) * 10;
		
		int unidade = resto1 - dezena;
		
		System.out.println("Centena: " + centena);
		System.out.println("Dezena: " + dezena);
		System.out.println("Unidade: " + unidade);
		
		entrada.close();

	}

}
