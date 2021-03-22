package exercisees_03_02_2021;

import java.util.Scanner;

public class QueueDemo {

	static int front = 0, rare = 0;
	static int[] queue = new int[5];
	static void menu() {
		String m = "Menu driven application \n";
		m += "1. Insert\n";
		m += "2. Delete\n";
		m += "3. display\n";
		m += "4. exit\n";
		m += "Select option?\n";
		System.out.println(m);
	}
	
	static boolean isEmpty() {
		boolean b = false;
		if(front == rare) {
			b = true;
		}
		return b;
	}
	
	static boolean isFull() {
		boolean b = false;
		if(rare == 5) {
			b = true;
		}
		return b;
	}
	
	static void insert(int number) {
		if(!isFull()) {
			queue[rare++] = number;
		}
		else {
			System.out.println("Queue is full.");
		}
	}
	
	static void delete() {
		if(!isEmpty()) {
			System.out.println("Deleted element is " + queue[front]);
			for (int i = 0; i < rare-1; i++) {
				queue[i] = queue[i + 1];
			}
		}
		else {
			System.out.println("Queue is empty.");
		}
	}
	
	static void display() {
		if(!isEmpty()) {
			for (int i = 0; i < rare; i++) {
				System.out.println(queue[i]);
			}
			rare--;
		}
		else {
			System.out.println("Queue is empty");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			menu();
			
			switch (scanner.nextInt()){
			case 1:
				System.out.println("Enter the value: ");
				insert(scanner.nextInt());
				break;
			case 2:
				delete();
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
