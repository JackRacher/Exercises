package exercises_03_07_2021;

import java.util.Scanner;

public class StringManipulator {

	
	static String removeVowels(String words) {
		String wordsWithConsonents = "";
		for (int i = 0; i < words.length(); i++) {
			if(!("AEIOU".contains("" + words.toUpperCase().charAt(i)))) {
				wordsWithConsonents += words.charAt(i);
			}
		}
		if(wordsWithConsonents == "") {
			return null;
		}
		return wordsWithConsonents;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the words you want to remove vowels in it: ");
		String words = scanner.next();
		System.out.println(removeVowels(words));
		scanner.close();
	}

}
