package stack.examples;

import entities.Product;
import stack.base.ArrayStack;
import stack.base.Stack;

public class TestStackProduct {

	public static void main(String[] args) {

		Stack<Product> stack = new ArrayStack<>();
		stack.push(new Product("Camisa", 80d));
		stack.push(new Product("Tenis", 200d));
		stack.push(new Product("Meia", 15d));
		stack.push(new Product("Calca", 150d));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
	}
}
