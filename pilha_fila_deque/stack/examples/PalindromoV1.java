package stack.examples;

import queue.base.LinkedQueue;
import stack.base.LinkedStack;

public class PalindromoV1 {
	
	private static boolean test(String cadeia) {
		LinkedStack<Character> pilha = new LinkedStack<>();
		LinkedQueue<Character> fila = new LinkedQueue<>();
		
		for(int i=0; i < cadeia.length(); i++) {
			pilha.push(cadeia.charAt(i));
			fila.enqueue(cadeia.charAt(i));
		}
		
		for(int i=0; i< cadeia.length();i++) {
			Character pilhaChar = pilha.pop();
			Character filaChar = fila.dequeue();
			
			if(pilhaChar != filaChar) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(test("ovo"));
		System.out.println(test("subinoônibus"));
		System.out.println(test("asacadadacasa"));
		System.out.println(test("anotaramadatadamaratona"));
		System.out.println(test("socorram-meemMarrocos"));
	}

}
