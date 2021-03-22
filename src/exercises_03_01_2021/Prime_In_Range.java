package exercises_03_01_2021;

import java.util.Scanner;

public class Prime_In_Range 
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
	static String primeList(int startValue, int endValue)
	{
		String res = "";
		for (int index = startValue; index <= endValue; index++) 
		{
			if(isPrime(index))
			{
				res += index + ",";
			}
			
		}
		return res.substring(0, res.length()-1);
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 value to find primes between them: ");
		System.out.println(primeList(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

}
