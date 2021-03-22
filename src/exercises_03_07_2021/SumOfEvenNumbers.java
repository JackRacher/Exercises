package exercises_03_07_2021;

import java.util.Scanner;

public class SumOfEvenNumbers {

	static int getSumOfEvenNumbers(int[] numbers) {
		int sum = 0;
		if(numbers.length == 0) {
			return -3;
		}
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				return -1;
			}
			else if(numbers[i] == 0) {
				return -2;
			}
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getSumOfEvenNumbers(numbers));
		scanner.close();
	}
}
