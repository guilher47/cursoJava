package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();

		// Offer e Add -> adicionam elementos  na fila
		//Diferen�a � o comportamento ocorre
		//quando fila est� cheia!
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); //Lan�a uma exce��o 
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o pr�ximo elemento da fila(sem remover)
		//Diferen�a � o comportamento ocorre
		//quando fila est� vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lan�a uma exce��o se estiver vazia
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		
		//Poll e Remove -> obter o pr�ximo elemento
		//da fila e remove!
		
		//Diferen�a � o comportamento ocorre
		//quando fila est� vazia!
		System.out.println(fila.poll()); // retorna falso
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}
}
