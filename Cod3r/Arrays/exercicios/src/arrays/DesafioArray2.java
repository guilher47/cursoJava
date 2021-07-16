package arrays;

import java.util.Scanner;

public class DesafioArray2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas notas quer Digitar? ");
		int qtdeNotas = sc.nextInt();
		
		double[] notas = new double[qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("informe as notas " + (i + 1) + ": ");
			notas[i] = sc.nextDouble();
		}
		double totalnotas = 0;
		for(double nota: notas) {
		totalnotas += nota;
		}
		double media = totalnotas / notas.length;
		System.out.println("A média das notas é: " + media);

	}

}
