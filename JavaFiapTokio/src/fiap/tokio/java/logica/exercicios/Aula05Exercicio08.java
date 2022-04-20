package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor em real: ");
		String realStr = entrada.nextLine();
		float real = Float.parseFloat(realStr);
		
		double dolar = real * 0.21;
		// mesma logica para outras moedas -- seja feliz
		
		System.out.println("");
		
		System.out.println("Valor em dolar: " + dolar);
		
		entrada.close();

	}

}
