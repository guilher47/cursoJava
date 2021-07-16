package arrays;

import java.util.Scanner;


public class ExercicioFacul {

	public static void main(String[] args) {
		
		String[] cadNome = new String[26];
		
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < cadNome.length; i++) {
			
			cadNome[i] = sc.next();
			System.out.println(cadNome[i]);
			
			
		}
	}

}
