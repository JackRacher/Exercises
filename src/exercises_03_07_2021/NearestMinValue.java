package exercises_03_07_2021;

import java.util.Arrays;
import java.util.Scanner;

public class NearestMinValue {

	static int getNearestMinValue(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[0] - 1;
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
		System.out.println(getNearestMinValue(numbers));
		scanner.close();
	}
}
