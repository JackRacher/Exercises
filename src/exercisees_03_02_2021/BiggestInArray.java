package exercisees_03_02_2021;

import java.util.Scanner;

public class BiggestInArray {
	static int findBiggest(int[] array){
		int big = array[0];
		for (int i = 1; i < array.length; i++) {
			if(big < array[i]){
				big = array[i];
			}//if closing
		}// for closing
		return big;
	}// method closing
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		System.out.println("Enter the 10 values in the array: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}//for closing
		System.out.println(findBiggest(numbers));
		scanner.close();
	}//main closing

}//class close
