package exercisees_03_02_2021;

import java.util.Scanner;

public class StrongNumberProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number is Strong or not: ");
		int number = scanner.nextInt();
		int temp = number;
		int rem, product = 1, sum = 0;
		while (number > 0) {
			rem = number % 10;
			product = 1;
			for (int index = rem; index >= 2; index--) 
			{
				product *= index;
			}
			sum += product;
			number /= 10;
		}
		if(temp == sum) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not Strong");
		}
		scanner.close();
	}
	

}
