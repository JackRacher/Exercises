package exercises_03_08_2021;

import java.util.Scanner;

public class SumOfNumbesWithoutTeen {

	static int fixTeen(int number) {
		if(number >= 13 && number <= 19) {
			if(number == 15 || number == 16) {
				return number;
			}
			else {
				return 0;
			}
		}
		return number;
	}
	
	static int sumWithoutTeen(int num1, int num2, int num3) {
		int sum = 0;
		sum += fixTeen(num1) + fixTeen(num2) + fixTeen(num3);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers to print sum: ");
		System.out.println(sumWithoutTeen(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}
}
