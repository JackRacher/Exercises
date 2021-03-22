package exercisees_03_02_2021;

import java.util.Scanner;

public class SumOfNaturalUsingRecursive {
	
	static int getSumOfNatural(int num) {
		
		if(num == 1){
			return 1;
		}
		
		return num += getSumOfNatural(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the end range of the natural numbers to do the sum : ");
		System.out.println(getSumOfNatural(scanner.nextInt()));
		scanner.close();
	}

}
