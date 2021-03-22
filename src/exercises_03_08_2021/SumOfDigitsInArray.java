package exercises_03_08_2021;

import java.util.Scanner;

public class SumOfDigitsInArray {

	static int sumOfDigits(String word) {
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			
			if(Character.isDigit(word.charAt(i))) {
				sum += Integer.parseInt(word.charAt(i) + "");
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the alphanumaric value: ");
		
		System.out.println(sumOfDigits(scanner.next()));
		scanner.close();
	}
}
