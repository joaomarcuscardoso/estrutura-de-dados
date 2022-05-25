package stack.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import stack.base.LinkedStack;
import stack.base.Stack;

public class ParenMatch {
	private static List<Character> abre = new ArrayList<>();
	private static List<Character> fecha = new ArrayList<>();

	private static boolean parenMatch(String statement) {
		
		Stack<Character> pilha = new LinkedStack<>();

		for(int i =0; i < statement.length(); i++) {

			Character letra = statement.charAt(i);
			
			if(abre.contains(letra)) {
				pilha.push(letra);
			} else {
				
				if(fecha.contains(letra)) {
					if (pilha.isEmpty()) {
						return false;
					} else {
						if(pilha.pop() != abre.get(fecha.indexOf(letra))) {
							return false;
						}
					}
					
				} 
			}
		}
		
		if(pilha.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abre.add('(');
		abre.add('[');
		abre.add('{');
		fecha.add(')');
		fecha.add(']');
		fecha.add('}');
		
		System.out.println("Digite:");
		
		Scanner sc = new Scanner(System.in);
		
		String l =  sc.next();
		
		System.out.println(parenMatch(l));
	}
}
