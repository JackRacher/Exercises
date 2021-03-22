package exercisees_03_02_2021;

import java.util.Scanner;

public class SmallestInArray {
	static int findSmallest(int[] array){
		int big = array[0];
		for (int i = 1; i < array.length; i++) {
			if(big > array[i]){
				big = array[i];
			}//if close
			
		}//for close
		return big;
	}//method close
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter the 10 values in the array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}//for close
		System.out.println(findSmallest(numbers));
		scanner.close();
	}//close main
}//class close
