package exercisees_03_02_2021;

import java.util.Scanner;

public class DupicateInArray {

	static int countDuplicateArrayElements = -1;
	static boolean inArray(int[] numbers, int number) {
		boolean b = true;
		if(countDuplicateArrayElements >= 0) {
			for (int i = 0; i <= countDuplicateArrayElements; i++) {
				if(numbers[i] == number) {
					b = false;
				}
			}
		}
		return b;
	}
	static String getDuplicate(int[] numbers) {
		int count = 0;
		String res = "";
		int[] dupValues = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					if(inArray(dupValues, numbers[i]))
					{
						dupValues[count] = numbers[i];
						res += numbers[i] + "\n";
						++countDuplicateArrayElements;
						count++;
					}
				}
			}
		}
		if(res == "")
			res = "No elements repeted";
		return res;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter 5 Values: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getDuplicate(numbers));
		scanner.close();
	}
}
