package fiap.tokio.java.logica.exercicios;

public class Aula05Exercicio02 {

	public static void main(String[] args) {
		
		int numInteiro;
		float numFloat;
		double numDouble;
		
		numInteiro = 10;
		numFloat = 11.4f; // ou numFloat = (float) 11.4;
		numDouble = 12.3d; // ou numDouble = (double) 12.3;
		
		System.out.println(numInteiro);
		System.out.println(numFloat);
		System.out.println(numDouble);
		
		String strNumInteiro = Integer.toString(numInteiro);
		String strNumFloat = Float.toString(numFloat);
		String strNumDouble = Double.toString(numDouble);
		
		System.out.println(strNumInteiro);
		System.out.println(strNumFloat);
		System.out.println(strNumDouble);
		
	}

}
