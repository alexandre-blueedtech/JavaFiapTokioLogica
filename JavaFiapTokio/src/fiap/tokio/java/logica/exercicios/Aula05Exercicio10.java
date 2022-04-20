package fiap.tokio.java.logica.exercicios;

import java.util.Scanner;

public class Aula05Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite quantos anos de idade voc� tem: ");
		String anosStr = entrada.nextLine();
		int anos = Integer.parseInt(anosStr);
		
		System.out.print("Digite quantos meses de idade voc� tem: ");
		int meses = Integer.parseInt(entrada.nextLine());
		
		System.out.print("Digite quantos dias de idade voc� tem: ");
		int dias = Integer.parseInt(entrada.nextLine());
		
		int anosParaDias = anos * 365;
		int mesesParaDias = meses * 30;
		
		int totalDias = anosParaDias + mesesParaDias + dias;
		
		System.out.println("");
		System.out.println("Voc� j� viveu: " + totalDias + " dias!");
		
		entrada.close(); // fecha

	}

}
