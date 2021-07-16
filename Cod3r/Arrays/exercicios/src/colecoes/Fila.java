package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();

		// Offer e Add -> adicionam elementos  na fila
		//Diferença é o comportamento ocorre
		//quando fila está cheia!
		fila.add("Ana"); // retorna falso
		fila.offer("Bia"); //Lança uma exceção 
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obter o próximo elemento da fila(sem remover)
		//Diferença é o comportamento ocorre
		//quando fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança uma exceção se estiver vazia
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		
		//Poll e Remove -> obter o próximo elemento
		//da fila e remove!
		
		//Diferença é o comportamento ocorre
		//quando fila está vazia!
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
