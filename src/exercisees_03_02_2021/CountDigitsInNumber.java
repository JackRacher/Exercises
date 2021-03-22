package exercisees_03_02_2021;

import java.util.Scanner;

public class CountDigitsInNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the digits in it: ");
		int number = scanner.nextInt();
		System.out.print("Number of digits are: ");
		//System.out.println(String.valueOf(number).length());
		System.out.println(getlength(number));
		scanner.close();
		
	}
	
	static int getlength(int number) {
		if(number == 0) {
			return 0;
		}
		number = number / 10;
		return 1 + getlength(number);
	}

}
