package exercises_03_08_2021;

import java.util.Scanner;

public class DifferenceOf21 
{
	public static int diff21(int number)
	{
		int result = 21 - number;
		if(number > 21)
			return Math.abs(result) * 2;
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the diff: ");
		int number = scanner.nextInt();
		System.out.println(diff21(number));
		scanner.close();
	}

}
