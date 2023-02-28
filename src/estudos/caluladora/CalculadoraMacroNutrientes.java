package estudos.caluladora;

import java.util.Scanner;

public class CalculadoraMacroNutrientes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso;
		final int PROTEINA = 2;
		final int CARBOIDRATO = 3;
		
		System.out.println("Informe o peso atual:");
		peso = sc.nextDouble();
		
		System.out.println("Proteinas por peso corporal (aproximadamente): " + CalcularProteina(peso, PROTEINA));
		System.out.println("Carboidratos por peso corporal (aproximadamente): " + CalcularCarboidrato(peso, CARBOIDRATO));
		
		sc.close();
	}
	
	public static double CalcularProteina(double peso, int proteina) {
		return peso * proteina;
	}
	
	public static double CalcularCarboidrato(double peso, int carboidrato) {
		return peso * carboidrato;
	}
	
	

}
