package exercisees_03_02_2021;

import java.util.Scanner;

public class ReversUsingRecursive {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the digits in it: ");
		int number = scanner.nextInt();
		System.out.print("Revers of given number is: ");
		//System.out.println(String.valueOf(number).length());
		System.out.println(getNumber(number, 0));
		scanner.close();
		
	}
	
	static int getNumber(int number, int sum) {
		if(number == 0) {
			return sum;
		}
		sum = (sum * 10) + (number % 10);
		number = number / 10;
		return  getNumber(number, sum);
	}
}
