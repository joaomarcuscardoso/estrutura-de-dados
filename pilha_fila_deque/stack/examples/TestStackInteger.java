package stack.examples;

import stack.base.ArrayStack;
import stack.base.Stack;

public class TestStackInteger {

	public static void main(String[] args) {

		Stack<Integer> stack = new ArrayStack<>(3);
		stack.push(1);
		stack.push(3);
		stack.push(5);
		stack.push(7);
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
