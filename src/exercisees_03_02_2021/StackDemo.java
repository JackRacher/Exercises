package exercisees_03_02_2021;

import java.util.Scanner;

public class StackDemo {

	static int top = -1;
	static int[] stack = new int[5];
	static void menu() {
		String m = "Menu driven application \n";
		m += "1. push\n";
		m += "2. pop\n";
		m += "3. display\n";
		m += "4. exit\n";
		m += "Select option?\n";
		System.out.println(m);
	}
	
	static boolean isEmpty() {
		boolean b = false;
		if(top == -1) {
			b = true;
		}
		return b;
	}
	
	static boolean isFull() {
		boolean b = false;
		if(top == 4) {
			b = true;
		}
		return b;
	}
	
	static void push(int number) {
		if(!isFull()) {
			stack[++top] = number;
		}
		else {
			System.out.println("Stsck is full.");
		}
	}
	
	static void pop() {
		if(!isEmpty()) {
			System.out.println("Deleted element is " + stack[++top]);
		}
		else {
			System.out.println("Stsck is empty.");
		}
	}
	
	static void display() {
		if(!isEmpty()) {
			for (int i = 0; i <= top; i++) {
				System.out.println(stack[i]);
			}
		}
		else {
			System.out.println("Stack is empty");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			menu();
			
			switch (scanner.nextInt()){
			case 1:
				System.out.println("Enter the value: ");
				push(scanner.nextInt());
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invaid choice");
				break;
			}
		}
	}
}
