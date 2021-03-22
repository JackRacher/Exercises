package exercisees_03_02_2021;

import java.util.Scanner;

public class InsertionSort {
	
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String res = "";
		System.out.println("Enter the array size: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements in the array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		insertionSort(array);
		for (int i : array) { 
			res += i + " ";
		}
		System.out.println(res);
		scanner.close();
	}
}
