package exercises_03_07_2021;

import java.util.Scanner;

public class AnagramProgram {

	static String checkAnagram(String word1, String word2) {
		String result = "Not Anagram";
		int count = 0;
		if(word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				for (int j = 0; j < word2.length(); j++) {
					if(word1.charAt(i) == word2.charAt(j)) {
						count++;
						break;
					}
				}
			}
		}
		
		if(count == word1.length()) {
			result = "Anagram";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 words to check the words are anagram or not: ");
		System.out.println("Enter word 1: ");
		String word1 = scanner.next();
		System.out.println("Enter word 2: ");
		String word2 = scanner.next();
		System.out.println(checkAnagram(word1, word2));
		scanner.close();
	}

}
