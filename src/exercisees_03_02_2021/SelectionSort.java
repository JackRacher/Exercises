package exercisees_03_02_2021;

import java.util.Scanner;

public class SelectionSort {

	static int[] insertionSort(int[] numbers) {
		int temp = 0, index = 0, count = 0, val = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					val = numbers[j];
					count++;
					index = j;
				}
				
			}
			if(count != 0) {
				temp = numbers[i];
				numbers[i] = val;
				numbers[index] = temp;
			}
		}
		return numbers;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String res = "";
		System.out.println("Enter the array size: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements in the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		for (int i : insertionSort(array)) {
			res += i + " ";
		}
		System.out.println(res);
		scanner.close();
	}
}
