package exercises_03_08_2021;

import java.util.Scanner;

public class SumOfThreeNumbersWithoutTeen {

	static int count; 
	static int getNumber(int num) {
		if(num == 13)
			count++;
		if(count > 0)
			return 0;
		return num;
	}
	
	static int getSum(int num1, int num2, int num3) {
		int sum =0;
		
		sum += getNumber(num1) + getNumber(num2) + getNumber(num3);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three values to print sum: ");
		System.out.println(getSum(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}
}
