package exercisees_03_02_2021;

import java.util.Scanner;

public class SquarRoot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find wrther is is squar root or not: ");
		int number = scanner.nextInt();
		String res = "No a Square Root for the given number";
		for (int i = 0; i < (number / 2); i++) {
			if((i * i) == number) {
				res = "Square root of " + number + " = " + i;
			}
		}
		System.out.println(res);
		scanner.close();
	}

}
