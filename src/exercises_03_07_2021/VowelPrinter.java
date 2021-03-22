package exercises_03_07_2021;

import java.util.Scanner;

public class VowelPrinter {

	static String removeVowels(String words) {
		String vowels = "";
		for (int i = 0; i < words.length(); i++) {
			if("AEIOU".contains("" + words.toUpperCase().charAt(i))) {
				vowels += words.charAt(i);
			}
		}
		if(vowels == "") {
			return null;
		}
		return vowels;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the words you want to print vowels in it: ");
		String words = scanner.next();
		System.out.println(removeVowels(words));
		scanner.close();
	}
}
