package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Selecione seu gÃªnero seguindo as seguintes opções.");
		System.out.println("[M] - Masculino");
		System.out.println("[F] - Masculino");
		System.out.println("[O] - Outro");
		System.out.println("[N] - Não responder");
		
		System.out.print("Escolha sua opção: ");
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Olá, " + nome + "! Você escolheu a seguinte opção de gênero: " + genero);
		
		entrada.close();

	}

}
