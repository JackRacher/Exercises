package exercises_03_01_2021;

import java.util.Scanner;

public class PrimeNumber 
{
	static boolean isPrime(int num)
	{
		boolean b = true;
		for(int i = 2; i < (num / 2); i++)
		{
			if(num % i == 0)
			{
				b = false;
				break;
			}
		}
		return b;
	}
	
	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check the wether it is prime or not: ");
		if(isPrime(scanner.nextInt()))
		{
			res += "Prime Number";
		}
		else
		{
			res += "Not Prime";
		}
		System.out.println(res);
		scanner.close();

	}

}
