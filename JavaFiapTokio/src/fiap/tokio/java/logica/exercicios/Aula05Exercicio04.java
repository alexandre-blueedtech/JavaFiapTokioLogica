package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float notaA, notaB;
		
		System.out.print("Digite a primeira nota: ");
		notaA = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		notaB = entrada.nextFloat();
		
		float media = (notaA + notaB) / 2;
		
		System.out.println("A média final foi: " + media);
		
		entrada.close();
		
	}

}
