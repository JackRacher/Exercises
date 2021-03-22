package exercises_03_01_2021;

import java.util.Scanner;

public class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start number: ");
		int start = scanner.nextInt();
		System.out.println("Enter end number: ");
		int end = scanner.nextInt();
		for (int index = start; index <= end; index++) 
		{
			if(getPrime(index) && getPrime(index + 2))
			{
				System.out.println("(" +index +", " + (index + 2)+")");
			}
		}
		scanner.close();
	}
	public static boolean getPrime(int number)
	{
		int count = 0;
		if(number == 0 || number == 1)
			return false;
		else
		{
			for (int index = 2; index < number; index++) 
			{
				if(number % index == 0)
				{
					count++;
					break;
				}
			}
		}
		if(count == 1)
			return false;
		else
			return true;
	}
}
