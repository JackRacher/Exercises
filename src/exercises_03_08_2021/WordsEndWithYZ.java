package exercises_03_08_2021;

import java.util.Scanner;

public class WordsEndWithYZ {
static Scanner scanner = new Scanner(System.in);
	static int countYZ(String sentance) {
		int count = 0;
		String[] words = sentance.split(" ");
		for (int i = 0; i < words.length; i++) {
			
			if(words[i].toUpperCase().endsWith("Y") || words[i].toUpperCase().endsWith("Z")) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the sentance to check the Z and Y : ");
		
		System.out.println(countYZ(scanner.nextLine()));
	}
}
