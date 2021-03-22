package exercises_03_01_2021;

import java.util.Scanner;

public class Collarz 
{
	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Enter the number you want to find the collarz sequence: ");
		number = scanner.nextInt();
		while(number != 1)
		{
			res += number+ ", ";
			if(number % 2 == 0)
			{
				number = number / 2;
			}
				
			else
			{
				number = (3 * number) + 1;
			}
				
		}
		res += number + ".";
		System.out.println(res);
		scanner.close();
	}

}
