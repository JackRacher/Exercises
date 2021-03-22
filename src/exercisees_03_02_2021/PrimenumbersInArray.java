package exercisees_03_02_2021;

import java.util.Scanner;

public class PrimenumbersInArray {

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
	
	static String primeList(int[] numbers) {
		String res = "";
		
		for (int i = 0; i < numbers.length; i++) {
			if(isPrime(numbers[i])) {
				res += numbers[i] + " ";
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter the 10 values in the array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}//for close
		System.out.println(primeList(numbers));
		scanner.close();
	}//close main
}

