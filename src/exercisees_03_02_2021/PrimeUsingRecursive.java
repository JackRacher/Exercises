package exercisees_03_02_2021;

import java.util.Scanner;

public class PrimeUsingRecursive {

	static boolean getPrime(int num, int value) {
		
		if (num <= 2) 
            return (num == 2) ? true : false; 
        if (num % value == 0) 
            return false; 
        if (value * value > num) 
            return true; 
		
		return getPrime(num, value + 1);
	}
	
	public static void main(String[] args) {
		String res = ""; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the end range of the natural numbers to do the sum : ");
		if(getPrime(scanner.nextInt(), 2)) {
			res = "Prime number";
		}
		else {
			res = "Not prime number";
		}
		System.out.println(res);
		scanner.close();
	}
}
