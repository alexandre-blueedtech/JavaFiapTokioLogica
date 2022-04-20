package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor do produto: ");
		String valorProdutoStr = entrada.nextLine();
		float valorProduto = Float.parseFloat(valorProdutoStr);
		
		System.out.print("Valor pago: ");
		String valorPagoStr = entrada.nextLine();
		float valorPago = Float.parseFloat(valorPagoStr);
		
		float troco = valorPago - valorProduto;
		
		System.out.println("");
		
		System.out.printf("Valor do troco: R$ %.2f \n", troco);
		
		entrada.close();
		

	}

}
