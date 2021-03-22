package exercisees_03_02_2021;

import java.util.Scanner;

public class PrintReversOfArray {

	static String primeList(int[] numbers) {
		String res = "";
		
		for (int i = numbers.length-1; i >= 0; i--) {
				res += numbers[i] + " ";
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter the 10 values in the array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}//for close
		System.out.println(primeList(numbers));
		scanner.close();
	}//close m
}
