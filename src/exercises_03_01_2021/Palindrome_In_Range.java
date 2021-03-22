package exercises_03_01_2021;

import java.util.Scanner;

public class Palindrome_In_Range 
{
	static boolean isPalindrome(int num)
	{
		int temp = num, rem = 0, rev = 0;
		boolean b = false;
		while(temp > 0)
		{
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;
		}
		if(rev == num)
			b = true;
		return b;
	}
	
	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the given number is palindrome or not: ");
		if(isPalindrome(scanner.nextInt()))
		{
			res += "Palindrome";
		}
		else
		{
			res += "Not palindrome";
		}
		System.out.println(res);
		scanner.close();
	}

}
