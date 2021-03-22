package exercisees_03_02_2021;

import java.util.Scanner;

public class Print_Revers_Array {
		static int[] reversArray(int[] arr){
			int[] revers = new int[arr.length];
			int k = 0;
			for (int i = arr.length-1; i >= 0; i--) {
				revers[k] = arr[i];
				k++;
			}//for close
			return revers;
		}//method close
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int[] numbers = new int[5];
			System.out.println("Enter the 5 values in the array: ");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = scanner.nextInt();
			}//for close
			for(int x : reversArray(numbers)){
				System.out.println(x);
			}
			scanner.close();
		}//close main
		
	}//class close
